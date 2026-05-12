package org.example.service;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Section;

import java.util.ArrayList;
import java.util.List;

public class InstructorServiceImpl implements InstructorService{

    List<Instructor> instructorList;

    public InstructorServiceImpl() {
        this.instructorList = new ArrayList<Instructor>();
    }

    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
    }

    public void assignInstructortoSection(Instructor instructor, Section section, Course course, List<Instructor> instructorList){

        section.getinstructorList().add(instructor);
        System.out.println("Instructor assigned to the Section");

    }
    public List<Instructor> getInstructordetails(){
        return instructorList.stream().toList();
    }
}
