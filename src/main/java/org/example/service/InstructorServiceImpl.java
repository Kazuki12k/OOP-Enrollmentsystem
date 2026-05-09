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

    public void assignInstructortoSection(Instructor instructor, Section section, List<Instructor> instructorList){

        section.getinstructorList().add(instructor);
        System.out.println("Instructor assigned to the Section");

    }
    public List<Instructor> getInstructordetails(){
        return instructorList.stream().toList();
    }
}
