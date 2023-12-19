package org.example.work21.dao;
import org.example.work21.DataBaseConnection;
import org.example.work21.model.Homework;
import org.example.work21.model.Lesson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class LessonDaoImpl implements LessonDao{
    private Connection connection;
    public LessonDaoImpl() {
        try {
            this.connection = DataBaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Lesson addLesson(Lesson lesson){
        int id=0;
        String queryHomework= "INSERT INTO t_homework(name,description) VALUES(?,?)";
        String queryLesson="INSERT INTO t_lesson (name,updatedAt,homework_id) VALUES(?,?,?)";
        Homework homework = lesson.getHomework();
        try(PreparedStatement statementHm = connection.prepareStatement(queryHomework, Statement.RETURN_GENERATED_KEYS);
            PreparedStatement statementLs = connection.prepareStatement(queryLesson,Statement.RETURN_GENERATED_KEYS)) {
            statementHm.setString(1,homework.getName());
            statementHm.setString(2,homework.getDescription());
            int rez = statementHm.executeUpdate();
            if(rez>0){
                ResultSet generatedKeys = statementHm.getGeneratedKeys();
                generatedKeys.next();
                id= generatedKeys.getInt(1);
                homework.setId(id);
            }
            statementLs.setString(1,lesson.getName());
            statementLs.setString(2,lesson.getUpdatedAt());
            statementLs.setInt(3,id);
            rez= statementLs.executeUpdate();
            if(rez>0){
                ResultSet generatedKeys = statementLs.getGeneratedKeys();
                generatedKeys.next();
                id = generatedKeys.getInt(1);
                lesson.setId(id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lesson;
    }
    @Override
    public Lesson deleteLesson(int lessonId){
        Lesson lesson =getLessonById(lessonId);
        String query="DELETE from t_lesson WHERE id=?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1,lessonId);
            int execute = statement.executeUpdate();
            if(execute>0){
                return lesson;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    @Override
    public List<Lesson> getAllLesson(){
        List<Lesson> list = new ArrayList<>();
        String query = "SELECT * FROM t_lesson as tl join t_homework as th on tl.homework_id=th.id";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            boolean execute = statement.execute();
            if(execute){
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString(2);
                    String date = resultSet.getString("updatedAt");
                    int homeworkId = resultSet.getInt(5);
                    String homeworkName = resultSet.getString(6);
                    String homeworkDescription = resultSet.getString(7);
                    Homework homework = Homework.builder()
                            .id(homeworkId)
                            .name(homeworkName)
                            .description(homeworkDescription)
                            .build();
                    Lesson lesson = Lesson.builder()
                            .id(id)
                            .name(name)
                            .updatedAt(date)
                            .homework(homework)
                            .build();
                    list.add(lesson);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    @Override
    public Lesson getLessonById(int lessonId){
        Lesson lesson = null;
        String query = "SELECT * FROM t_lesson as tl join t_homework as th on tl.homework_id=th.id where tl.homework_id=?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, lessonId);
            boolean execute = statement.execute();
            if(execute){
                ResultSet resultSet = statement.getResultSet();
                resultSet.next();
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                String date = resultSet.getString("updatedAt");
                int homeworkId = resultSet.getInt(5);
                String homeworkName = resultSet.getString(6);
                String homeworkDescription = resultSet.getString(7);
                Homework homework = Homework.builder()
                        .id(homeworkId)
                        .name(homeworkName)
                        .description(homeworkDescription)
                        .build();
                lesson = Lesson.builder()
                        .id(id)
                        .name(name)
                        .updatedAt(date)
                        .homework(homework)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lesson;
    }
}
