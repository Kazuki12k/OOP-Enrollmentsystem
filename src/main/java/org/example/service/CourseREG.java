package org.example.service;

import org.example.model.Course;

public interface CourseREG {
    void addCourse(Course course);
    void DisplayCourses();
    void updateCourse(Course course);
    void deleteCourseRecord(Course course);
}
