package org.example.service;

import org.example.model.Section;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService{

    final int MAXCAPACITY = 30;


    public void enrollStudentinSection(Student student, Section section, List studentList){
        for(int i = 0; i < studentList.size(); i++){
        section.getstudentList().add(student);
        }
    }

    public void viewDepartmentHierarchy(){

    }
}
