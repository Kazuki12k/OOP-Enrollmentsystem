package org.example.model;

public class Instructor {
    String InstructorID;
    String InstructorName;
    String Courses;

    public Instructor(String ID, String Name, String Courses) {
        this.InstructorID = ID;
        this.InstructorName = Name;
        this.Courses = Courses;
    }

    public void setInstructorID(){
        this.InstructorID = InstructorID;
    }
    public String getInstructorID(){
        return InstructorID;
    }

    public void setInstructorName() {
        this.InstructorName = InstructorName;
    }
    public String getInstructorName() {
        return InstructorName;
    }

    public void setCourses() {
        this.Courses = Courses;
    }
    public String getCourses() {
        return Courses;
    }

}
