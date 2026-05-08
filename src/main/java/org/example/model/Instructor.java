package org.example.model;

import java.util.List;

public class Instructor extends Person{
    private List<Course> courseList;

    public Instructor(int PersonID, String PersonName, List<Course>courseList) {
        super(PersonID, PersonName);
        this.courseList = courseList;
    }

    public List<Course> displayCourses() {
        return courseList.stream().toList();
    }

    @Override
    public void setPersonID() {
        super.setPersonID();
    }

    @Override
    public int getPersonID() {
        return super.getPersonID();
    }

    @Override
    public void setPersonName() {
        this.PersonName = PersonName;
    }
    @Override
    public String getPersonName() {
        return PersonName;
    }

}
