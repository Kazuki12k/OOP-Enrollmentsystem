package org.example.service;

import org.example.model.Course;
import org.example.model.Student;

import java.util.List;

public interface StudentREG {
    void addStudent(Student student);
    List<Student> displayStudent();
    void updateStudent(Student student);
    void deleteStudentRecord(Student student);
}
