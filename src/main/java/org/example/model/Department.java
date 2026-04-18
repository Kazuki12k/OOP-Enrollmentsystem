package org.example.model;

import java.util.*;

public class Department {
    private String departmentID;
    private String departmentName;
    private List<Instructor> instructorList;


    public Department(String departmentID, String departmentName, List instructorList) {
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

     
}
