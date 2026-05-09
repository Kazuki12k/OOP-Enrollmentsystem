package org.example.service;

import org.example.model.Section;
import org.example.model.Student;

public interface EnrollmentService {
    void enrollStudentinSection(Student student, Section section);
    void viewDepartmentHierarchy();
}
