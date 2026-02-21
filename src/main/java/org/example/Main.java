package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();

        studentRegistration.addStudent(new Student(000123, "John Doe", "Information Technology"));
        studentRegistration.addStudent(new Student(000124, "Jane Doe", "Information Technology"));
        courseRegistration.addCourse(new Course(00001, "Integrative Programming", "Information Technology"));

        studentRegistration.displayAll();
        courseRegistration.DisplayAll();


    }
}
