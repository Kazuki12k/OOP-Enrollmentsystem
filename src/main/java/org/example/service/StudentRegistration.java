package org.example.service;

import java.util.ArrayList;
import org.example.model.Student;

public class StudentRegistration {

    private ArrayList<Student> studentlist = new ArrayList<Student>();

    public void addStudent(Student student){
        studentlist.add(student);
    }

}
