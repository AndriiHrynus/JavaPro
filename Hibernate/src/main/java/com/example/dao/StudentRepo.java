package com.example.dao;
import com.example.entity.Student;
import java.util.List;
public interface StudentRepo {
    void add (Student student);
    void remove(Long id);
    void update(Student student);
    Student getById(Long id);
    List<Student> getAll();
}
