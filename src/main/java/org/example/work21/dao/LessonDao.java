package org.example.work21.dao;

import org.example.work21.model.Lesson;

import java.util.List;

public interface LessonDao {
    Lesson addLesson(Lesson lesson);
    Lesson deleteLesson(int lessonId);
    List<Lesson> getAllLesson();
    Lesson getLessonById(int lessonId);
}
