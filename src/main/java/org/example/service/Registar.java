package org.example.service;

import org.example.model.*;

import java.util.List;

public class Registar {
    private StudentREG studentREG;
    private CourseREG courseREG;
    private DepartmentREG departmentREG;
    private EnrollmentService enrollmentServ;
    private TuitionService tuitionServ;
    private InstructorService instructorServ;
    private SectionREG sectionREG;


    public Registar(StudentREG studentREG, CourseREG courseREG, DepartmentREG departmentREG, EnrollmentService enrollmentServ, TuitionService tuitionServ, InstructorService instructorServ,SectionREG sectionREG) {
        this.studentREG = studentREG;
        this.courseREG = courseREG;
        this.departmentREG = departmentREG;
        this.enrollmentServ =  enrollmentServ;
        this.tuitionServ = tuitionServ;
        this.instructorServ = instructorServ;
        this.sectionREG = sectionREG;
    }

    public String registerStudent(Student student) {
        studentREG.addStudent(student);
        return "Added";
    }

    public String displayStudents(){
        studentREG.displayStudents();
        return "Displaying Students";
    }

    public String updateStudentRecord(Student student) {
        studentREG.updateStudent(student);
        return "Updated Succesfully";

    }
    public String deleteStudentRecord(Student student) {
        studentREG.deleteStudentRecord(student);
        return "Deleted Succesfully";
    }


    public String addCourse(Course course) {
        courseREG.addCourse(course);
        return "Course added";
    }

    public String displayCourses(){
        courseREG.DisplayCourses();
        return "Displaying Courses";
    }

    public String updateCourse(Course course) {
        courseREG.updateCourse(course);
        return "Updated Succesfully";
    }

    public String deleteCourse(Course course) {
        courseREG.deleteCourseRecord(course);
        return "Deleted Succesfully";
    }

    public void saveDepartment(Department department) {
        departmentREG.saveDepartment(department);
    }

    public void updateDepartment(Department department){
        departmentREG.updateDepartment(department);
    }
    public void deleteDepartment(Department department){
        departmentREG.deleteDepartment(department);
    }
    public List<Department> displayDepartments(){
       return departmentREG.displayDepartments();
    }

    public double calculateTuitionFee(double units, double discountrate){
        return tuitionServ.calculateTuitionFee(units, discountrate);
    }
    public void makePayment(double amount){
        tuitionServ.makePayment(amount);
    }
    public double getBalance(){
        return tuitionServ.getBalance();
    }
    public boolean isFullyPaid(){
       return tuitionServ.isFullyPaid();
    }

    public void enrollStudentinSection(Student student, Section section, List<Student> studentList){
        enrollmentServ.enrollStudentinSection(student, section, studentList);
    }
    public void viewDepartmentHierarchy(Department department){
        enrollmentServ.viewDepartmentHierarchy(department);
    }

    public void addInstructor(Instructor instructor){
        instructorServ.addInstructor(instructor);
    }
    public void assignInstructortoSection(Instructor instructor, Section sectionName, List<Instructor> instructorList){
        instructorServ.assignInstructortoSection(instructor, sectionName, instructorList);
    }
    public List<Instructor> getInstructordetails(){
        return instructorServ.getInstructordetails();
    }

    public void addSection(Section section){sectionREG.addSection(section);}

    public void updateSection(Section section){sectionREG.updateSection(section);}

    public void deleteSection(Section section){sectionREG.deleteSection(section);}

    public List<Section> displaySections(){return sectionREG.displaySections();}


}
