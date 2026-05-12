package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseID;
    private String coursename;
    private String courseprogram;
    private Department department;
    private List<Section> sectionList;

    public Course(int ID, String name, String program, Department department) {
        courseID = ID;
        coursename = name;
        courseprogram = program;
        this.department = department;
        this.sectionList = new ArrayList<>();
    }

    public void setCourseID(int courseID){
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCourseprogram(String courseprogram) {
        this.courseprogram = courseprogram;
    }

    public String getCourseprogram() {
        return courseprogram;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    public Department getDepartment(){
        return department;
    }

    public List<Section> getSectionList(){
        return sectionList;
    }

    public void setSectionList(List<Section> sectionList){
        this.sectionList = sectionList;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseID +
                " | Name: " + coursename +
                " | Program: " + courseprogram +
                " | Department: " + department;
    }
}