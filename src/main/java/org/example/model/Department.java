package org.example.model;

import java.util.*;

public class Department {
    String departmentID;
    String departmentName;
    private List<Instructor> instructorList;
    private List<Section> sectionList;

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public Department(String departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName =departmentName;
    }

    public Department(String departmentName, List<Section> sectionList){
        this.departmentName = departmentName;
        this.sectionList = new ArrayList<>();
    }

    public Department(String departmentID, String departmentName, List<Instructor> instructorList) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.instructorList = new ArrayList<>();

    }

     public String getDepartmentID() {
        return departmentID;
     }

     public String getDepartmentName() {
        return departmentName;
     }

     public List<Instructor> getInstructorList() {return instructorList;}

    public List<Section> getSectionList() {
        return sectionList;
    }

     
}
