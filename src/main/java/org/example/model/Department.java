package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName; // e.g. CITE
    private List<Course> courses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}