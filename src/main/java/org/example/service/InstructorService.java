package org.example.service;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Section;

import java.util.List;

public interface InstructorService {
    void addInstructor(Instructor instructor);
    void assignInstructortoSection(Instructor instructor, Section sectionName, Course course, List<Instructor> instructorList);
    List<Instructor> getInstructordetails();
}
