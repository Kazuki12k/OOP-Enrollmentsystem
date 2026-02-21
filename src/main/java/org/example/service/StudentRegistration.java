package org.example.service;

import java.util.ArrayList;
import org.example.model.Student;

public class StudentRegistration {

    private ArrayList<Student> studentlist = new ArrayList<Student>();

    public void addStudent(Student student){
        studentlist.add(student);
    }

    public void displayAll(){
        for(Student s: studentlist){
            System.out.println(s.getStudentID());
            System.out.println(s.getStudentName());
            System.out.println(s.getStudentProgram());

        }
    }

    public void updateStudent(Student student){
        for(int i = 0; i < studentlist.size(); i++){
            if(studentlist.get(i).getStudentID().equals(student.getStudentID())){
                studentlist.set(i, student);
                break;
            }
        }
    }

    public void deleteStudentRecord(Student student) {
        for(int i = 0; i < studentlist.size(); i++) {
            if(studentlist.get(i).getStudentID().equals(student.getStudentID())){
                studentlist.remove(i);
                break;
            }
        }
    }

}
