package org.example.service;

import java.util.ArrayList;
import org.example.model.Student;

public class StudentRegistration implements StudentREG{

    private ArrayList<Student> studentlist = new ArrayList<Student>();

    public void addStudent(Student student){
        studentlist.add(student);
    }

    public void displayStudents(){
        for(Student s: studentlist){
            System.out.println(s.getPersonID());
            System.out.print(s.getPersonName());
            System.out.print(s.getStudentProgram());

        }
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
