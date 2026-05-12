package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Course;


public class CourseRegistration implements CourseREG{
    private ArrayList<Course> courselist = new ArrayList<Course>();

    public void addCourse(Course course) {
        courselist.add(course);
    }

    public List<Course> DisplayCourses(){
        return courselist.stream().toList();
    }

    public void updateCourse(Course course) {
        for(int i = 0; i < courselist.size(); i++){
            if(courselist.get(i).getCourseID() == (course.getCourseID())){
                courselist.set(i, course);
                break;
            }
        }
    }

    public void deleteCourseRecord(Course course) {
        for(int i = 0; i < courselist.size(); i++) {
            if(courselist.get(i).getCourseID() == (course.getCourseID())){
                courselist.remove(i);
                break;
            }
        }
    }


}
