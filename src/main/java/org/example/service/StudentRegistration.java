package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Student;

public class StudentRegistration implements StudentREG{

    private ArrayList<Student> studentlist = new ArrayList<Student>();

    public void addStudent(Student student){
        studentlist.add(student);
    }

    public List<Student> displayStudent(){
        return studentlist.stream().toList();
    }

    public void updateStudent(Student student){
        for(int i = 0; i < studentlist.size(); i++){
            if(studentlist.get(i).getPersonID() == (student.getPersonID())){
                studentlist.set(i, student);
                break;
            }
        }
    }

    public void deleteStudentRecord(Student student) {
        for(int i = 0; i < studentlist.size(); i++) {
            if(studentlist.get(i).getPersonID() == (student.getPersonID())){
                studentlist.remove(i);
                break;
            }
        }
    }

}
