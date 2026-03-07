package org.example.model;

public class Student {

    String StudentName;
    int StudentID;
    String StudentProgram;


    public Student() {

    }

    public Student(int StudentID, String StudentName, String StudentProgram) {

        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentProgram = StudentProgram;

    }

    public void setStudentID() {
        this.StudentID = StudentID;
    }

    public int getStudentID() {

        return StudentID;
    }

    public void setStudentName() {
        this.StudentName = StudentName;
    }

    public String getStudentName() {

        return StudentName;
    }

    public void setStudentProgram() {
        this.StudentProgram = StudentProgram;
    }

    public String getStudentProgram() {

        return StudentProgram;
    }

}
