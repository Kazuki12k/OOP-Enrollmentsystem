package org.example.service;

import org.example.model.Course;

import java.util.List;

public interface CourseREG {
    void addCourse(Course course);
    List<Course> DisplayCourses();
    void updateCourse(Course course);
    void deleteCourseRecord(Course course);
}
