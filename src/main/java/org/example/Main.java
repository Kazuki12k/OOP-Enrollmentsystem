package org.example;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Person;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        StudentRegistration studentRegistration = new StudentRegistration();
//        CourseRegistration courseRegistration = new CourseRegistration();
        List<Course> courseList = new ArrayList<>();

        Course c1 = new Course(02, "Discrete Mathematics", "IT");
        Course c2 = new Course(79, "Information Management", "IT");

//        studentRegistration.addStudent(new Student(000123, "John Doe", "IT"));
//        studentRegistration.addStudent(new Student(000124, "Jane Doe", "IT"));
//        courseRegistration.addCourse(new Course(00001, "Integrative Programming", "IT"));



        courseList.add(c1);
        courseList.add(c2);

        Instructor instructor = new Instructor(06, "Alpha", courseList);
        System.out.println(instructor.getPersonName());
        System.out.println(instructor.getPersonID());
        System.out.println(instructor.displayCourses());


//        studentRegistration.displayAll();
//        courseRegistration.DisplayAll();


    }
}
