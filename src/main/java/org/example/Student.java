package org.example;

public class Student {


    String StudentName;
    int StudentIDnumber;
    String StudentProgram;

    }
    public Student() {

    }

    public Student(int IDnumber, String Name, String Program){

        StudentIDnumber = IDnumber;
        StudentName = Name;
        StudentProgram = Program;

    }
    public String getStudentName() {
        return Name;
    }
    public int getIDnumber() {

        return IDnumber;
    }