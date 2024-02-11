package com.example.dao;
import com.example.HibernateSession;
import com.example.entity.Student;
import org.hibernate.Session;
import java.util.List;
public class StudentRepoImpl implements StudentRepo{
    private Session session = null;
    @Override
    public void add(Student student) {
       try {
           session = HibernateSession.getSessionFactory().openSession();
           session.beginTransaction();
           session.persist(student);
           session.getTransaction().commit();
       } catch (Exception e){
            session.getTransaction().rollback();
       } finally {
           session.close();
       }
    }
    @Override
    public void remove(Long id) {
        try {
            session = HibernateSession.getSessionFactory().openSession();
            session.beginTransaction();
            Student student = session.get(Student.class,id);
            session.remove(student);
            session.getTransaction().commit();
        } catch (Exception e){
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    @Override
    public void update(Student student) {
        try {
            session = HibernateSession.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        } catch (Exception e){
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    @Override
    public Student getById(Long id) {
        try {
            session = HibernateSession.getSessionFactory().openSession();
            return session.get( Student.class, id);
        } catch (Exception e){
            return null;
        } finally {
            session.close();
        }
    }
    @Override
    public List<Student> getAll() {
        try {
            session = HibernateSession.getSessionFactory().openSession();
            return session.createQuery("from Student ", Student.class).list();
        } catch (Exception e){
            return null;
        } finally {
            session.close();
        }
    }
}
