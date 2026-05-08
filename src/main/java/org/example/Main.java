package org.example;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.Registar;
import org.example.service.StudentRegistration;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Course> courseList = new ArrayList<>();
        List<Instructor> instructorList = new ArrayList<>();

        Registar registar = new Registar(new StudentRegistration(), new CourseRegistration());

        registar.registerStudent(new Student(000123, "John Doe", "IT"));
        registar.registerStudent(new Student(000124, "Jane Doe", "IT"));
        registar.addCourse(new Course(00001, "Integrative Programming", "IT"));
        registar.saveDepartment("CITE", "College of Information Technology and Engineering", instructorList);

        registar.displayAll();
        registar.displayALL();




    }
}
