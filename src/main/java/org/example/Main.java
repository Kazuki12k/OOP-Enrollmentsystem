package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Course> courseList = new ArrayList<>();
        List<Instructor> instructorList = new ArrayList<>();
        List<Section> sectionList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        Registar registar = new Registar(new StudentRegistration(), new CourseRegistration(), new DepartmentRegistration(), new EnrollmentServiceImpl(), new TuitionFeePayment(), new InstructorServiceImpl());

        System.out.println("WELCOME TO ENROLLMENT SYSTEM");
        System.out.println("----------------------------");
        System.out.println("PLEASE SELECT ACTION");
        System.out.println("    1.Register Student");
        System.out.println("    2.Register Instructor");
        System.out.println("    3.View Tuition");
        System.out.println("    4.Exit");
        System.out.println("----------------------------");



    }
}
