package org.example.service;

import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

import java.util.List;

public interface EnrollmentService {
    void enrollStudentinSection(Student student, Section section, List<Student> studentList);
    void viewDepartmentHierarchy(Department department);
}
