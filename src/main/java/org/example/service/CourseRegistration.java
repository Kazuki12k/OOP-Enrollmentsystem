package org.example.service;

import java.util.ArrayList;
import org.example.model.Course;


public class CourseRegistration {
    private ArrayList<Course> courselist = new ArrayList<Course>();

    public void addCourse(Course course) {
        courselist.add(course);
    }

    public void DisplayAll(){
        for(Course c: courselist){
            System.out.println(c.getCourseID());
            System.out.println(c.getCoursename());
            System.out.println(c.getCourseprogram());
        }
    }

    public void updateCourse(Course course) {
        for(int i = 0; i < courselist.size(); i++){
            if(courselist.get(i).getCourseID().equals(course.getCourseID()));
        }
    }
}
