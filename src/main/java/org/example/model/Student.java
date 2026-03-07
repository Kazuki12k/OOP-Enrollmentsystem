package org.example.model;

public class Student extends Person{


    String StudentProgram;

    public Student(int PersonID, String PersonName, String StudentProgram) {
        super(PersonID, PersonName);
        this.StudentProgram = StudentProgram;
    }

    public void setStudentProgram() {
        this.StudentProgram = StudentProgram;
    }

    public String getStudentProgram() {

        return StudentProgram;
    }

}
