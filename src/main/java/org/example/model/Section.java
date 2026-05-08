package org.example.model;

import java.util.*;

public class Section{
    private String sectionID;
    final int MAXCAPACITY = 30;
    private List<Student> StudentList;

    public Section(String sectionID, String departmentID, List<Student> StudentList){

        this.sectionID = sectionID;
        this.StudentList = StudentList;

    }

    public String getSectioncode() {
        return sectionID;
    }
}
