package org.example.service;

import org.example.model.Section;
import org.example.model.Student;

import java.util.ArrayList;

public class SectionRegistration {
    private ArrayList<Section> sectionList = new ArrayList<Section>();

    public void addStudent(Section section){
        sectionList.add(section);
    }

    public void displayStudents(){
        for(Section sec: sectionList){
            System.out.println(sec.getSectionName() + " | " + sec.getDepartmentName() + " | " + sec.getinstructorList() + " | " + sec.getstudentList());
        }
    }

    public void updateStudent(Section section){
        for(int i = 0; i < sectionList.size(); i++){
            if(sectionList.get(i).getSectionName() == (section.getSectionName())){
                sectionList.set(i, section);
                break;
            }
        }
    }

    public void deleteStudentRecord(Section section) {
        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionList() == (section.getSectionList())) {
                sectionList.remove(i);
                break;
            }
        }
    }
}
