package org.example.model;

import java.util.*;

public class Department {
    String departmentID;
    String departmentName;
    private List<Course> courseList;
    private List<Instructor> instructorList;
    private List<Section> sectionList;

    public Department(String departmentName, List<Course> courseList, List<Section> sectionList){
        this.departmentName = departmentName;
        this.courseList = courseList;
        this.sectionList = sectionList;
    }

    public Department(String departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.instructorList = new ArrayList<>();
        this.sectionList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

    public Department(String departmentName, List<Section> sectionList){
        this.departmentName = departmentName;
        this.sectionList = sectionList;
        this.instructorList = new ArrayList<>();
    }

    public Department(String departmentID, String departmentName, List<Instructor> instructorList) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.instructorList = instructorList;
        this.sectionList = new ArrayList<>();
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public List<Section> getSectionList() {
        return sectionList;
    }

    public List<Course> getCourseList(){
        return courseList;
    }

    public void setDepartmentID(String departmentID){
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setCourseList (List<Course> courseList){
        this.courseList = courseList;
    }

    public void setInstructorList (List<Instructor> instructorList){
        this.instructorList = instructorList;
    }

    public void setSectionList(List<Section> sectionList){
        this.sectionList = sectionList;
    }
}