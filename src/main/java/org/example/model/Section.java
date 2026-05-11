package org.example.model;

import java.util.*;

public class Section{
    private String sectionName;
    final int MAXCAPACITY = 30;
    private List<Student> studentList;
    private List<Instructor> instructorList;

    public Section(String sectionName, List<Student> studentList, List<Instructor> instructorList){
        this.sectionName = sectionName;
        this.studentList = new ArrayList<>();
        this.instructorList = new ArrayList<>();
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

    public List<Instructor> getinstructorList(){
        return instructorList;
    }
}
