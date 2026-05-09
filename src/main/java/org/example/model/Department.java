package org.example.model;

import java.util.*;

public class Department {
    public String departmentID;
    public String departmentName;
    private List instructorList;

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public Department(String departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName =departmentName;
    }

    public Department(String departmentID, String departmentName, List<Instructor> instructorList) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.instructorList = instructorList;

    }

     public String getDepartmentID() {
        return departmentID;
     }

     public String getDepartmentName() {
        return departmentName;
     }

     public List getInstructorList() {return instructorList;}

     
}
