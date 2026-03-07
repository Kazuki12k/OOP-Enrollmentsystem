package org.example.model;

public class Instructor extends Person{
    String Courses;

    public Instructor(String PersonID, String PersonName, String Courses) {
        super(PersonID, PersonName);
        this.Courses = Courses;
    }

    public void setCourses() {
        this.Courses = Courses;
    }
    public String getCourses() {
        return Courses;
    }
}
