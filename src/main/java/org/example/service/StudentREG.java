package org.example.service;

import org.example.model.Student;

public interface StudentREG {
    void addStudent(Student student);
    void displayStudents();
    void updateStudent(Student student);
    void deleteStudentRecord(Student student);
}
