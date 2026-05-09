package org.example.model;

import java.util.*;

public class Section extends Department{
    private String sectionName;
    final int MAXCAPACITY = 30;
    public List<Student> studentList;

    public Section(String sectionName, String departmentName, List<Student> studentList){
        super(departmentName);
        this.sectionName = sectionName;
        this.studentList = new ArrayList<>();

    }

    public String getSectionName() {
        return sectionName;
    }

    public int getMAXCAPACITY() {
        return MAXCAPACITY;
    }

    public List<Student> getstudentList(){
        return studentList;
    }
}
