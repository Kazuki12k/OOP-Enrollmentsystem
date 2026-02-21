package org.example.model;

public class Course {
    int courseID;
    String coursename;
    String courseprogram;

    public Course(String name, int ID, String program) {
        courseID = id;
        coursename = name;
        courseprogram = program;

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

}