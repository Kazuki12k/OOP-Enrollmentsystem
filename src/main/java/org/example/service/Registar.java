package org.example.service;

import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Instructor;
import org.example.model.Department;

import java.util.List;

public class Registar {
    private StudentREG studentREG;
    private CourseREG courseREG;
    private DepartmentREG departmentREG;

    public Registar(StudentREG studentREG, CourseREG courseREG) {
        this.studentREG = studentREG;
        this.courseREG = courseREG;
    }

    public String saveDepartment(String departmentID, String departmentName, List<Instructor> instructorList) {
        departmentREG.saveDepartment(new Department(departmentID, departmentName, instructorList));
        return "Succesfully Added";
    }
    public String registerStudent(Student student) {
        studentREG.addStudent(student);
        return "Added";
    }

    public String displayAll(){
        studentREG.displayAll();
        return "Displaying Students";
    }

    public String updateStudentRecord(Student student) {
        studentREG.updateStudent(student);
        return "Updated Succesfully";

    }
    public String deleteStudentRecord(Student student) {
        studentREG.deleteStudentRecord(student);
        return "Deleted Succesfully";
    }


    public String addCourse(Course course) {
        courseREG.addCourse(course);
        return "Course added";
    }

    public String displayALL(){
        courseREG.DisplayAll();
        return "Displaying Courses";
    }

    public String updateCourse(Course course) {
        courseREG.updateCourse(course);
        return "Updated Succesfully";
    }

    public String deleteCourse(Course course) {
        courseREG.deleteCourseRecord(course);
        return "Deleted Succesfully";
    }

}
