package org.example.model;

import java.util.*;

public class Section extends Department{
    private String sectionName;
    final int MAXCAPACITY = 30;
    private List<Student> StudentList;

    public Section(String sectionName, String departmentName, List<Student> StudentList){
        super(departmentName);
        this.sectionName = sectionName;
        this.StudentList = StudentList;

    }

    public String getSectionName() {
        return sectionName;
    }

    public int getMAXCAPACITY() {
        return MAXCAPACITY;
    }
}
