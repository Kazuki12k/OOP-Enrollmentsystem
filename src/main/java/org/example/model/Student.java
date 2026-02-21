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

    public String getStudentName() {

        return StudentName;
    }

    public int getID() {

        return StudentID;
    }
}
