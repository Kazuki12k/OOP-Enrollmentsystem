package org.example.service;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final int MAXCAPACITY = 30;

    public void enrollStudentinSection(Student student, Section section, List<Student> studentList) {

        if (studentList.size() >= MAXCAPACITY) {
            System.out.println("ERROR: Section is already full (max 30 students).");
            return;
        }

        for (Student s : studentList) {
            if (s.getPersonID() == student.getPersonID()) {
                System.out.println("ERROR: Student already enrolled in this section.");
                return;
            }
        }

        studentList.add(student);
        System.out.println("SUCCESS: Student Enrolled");
    }

    public void viewDepartmentHierarchy(Department department) {

        System.out.println("Department: " + department.getDepartmentName());

        for (Course course : department.getCourseList()) {
            System.out.println("  Course: " + course.getCoursename());

        for (Section section : department.getSectionList()) {
            System.out.println("Section: " + section.getSectionName());

            for (Student student : section.getstudentList()) {
                System.out.println(" - " + student.getPersonName());
                }
            }
        }
    }
}