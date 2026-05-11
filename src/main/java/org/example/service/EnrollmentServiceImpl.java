package org.example.service;

import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

import java.util.*;

public class EnrollmentServiceImpl implements EnrollmentService{

    final int MAXCAPACITY = 30;


    public void enrollStudentinSection(Student student, Section section, List<Student> studentList){
        for(int i = 0; i < studentList.size(); i++){

            if(studentList.size() >= MAXCAPACITY) {
                System.out.println("Section already full");
                return;
            }
            else{
                section.getstudentList().add(student);
                System.out.println("Student Enrolled");
            }
        }
    }

    public void viewDepartmentHierarchy(Department department){
        System.out.println("Department: " + department.getDepartmentName());
        for(Section section : department.getSectionList()) {
            System.out.println("Section " + section.getSectionName());
            for(Student student : section.getstudentList()) {
                System.out.println("Students: " + student.getPersonName());
            }
        }
    }
}
