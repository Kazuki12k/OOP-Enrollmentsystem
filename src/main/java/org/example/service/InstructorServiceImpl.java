package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;

import java.util.List;

public class InstructorServiceImpl implements InstructorService{

    List<Instructor> instructorList;
    List<Section> SectionList;

    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
    }
    public void assignInstructortoSection(Instructor instructor, Section sectionID){

    }
    public void getInstructordetails(){

    }
}
