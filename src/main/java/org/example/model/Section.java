package org.example.model;

import java.util.*;

public class Section extends Department {

    private String sectionName;
    private static final int MAXCAPACITY = 30;
    private List<Student> studentList;
    private List<Instructor> instructorList;

    public Section(String sectionName, String departmentName, List<Student> studentList, List<Instructor> instructorList) {

        super(departmentName); // FIX: properly set Department
        this.sectionName = sectionName;
        this.studentList = studentList;
        this.instructorList = instructorList;

    }

    public String getSectionName() {
        return sectionName;
    }

    public int getMAXCAPACITY() {
        return MAXCAPACITY;
    }

    public List<Student> getstudentList() {
        return studentList;
    }

    public List<Instructor> getinstructorList() {
        return instructorList;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
}