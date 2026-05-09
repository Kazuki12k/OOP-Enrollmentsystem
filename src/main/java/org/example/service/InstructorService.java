package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;

public interface InstructorService {
    void addInstructor(Instructor instructor);
    void assignInstructortoSection(Instructor instructor, Section sectionID);
    void getInstructordetails();
}
