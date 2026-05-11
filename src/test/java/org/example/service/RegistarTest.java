package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegistarTest {
    private Registar registar;
    private StudentREG studentREG;
    private CourseREG courseREG;
    private DepartmentREG departmentREG;
    private EnrollmentService enrollmentServ;
    private TuitionService tuitionServ;
    private InstructorService instructorServ;


    //arrange
    @BeforeEach
    void setup() {
        registar = new Registar(StudentREG studentREG, CourseREG courseREG, DepartmentREG departmentREG, EnrollmentService enrollmentServ, TuitionService tuitionServ, InstructorService instructorServ);
    }


    @Test
    void shouldsaveDepartment() {

        departmentREG.saveDepartment(new Department(01,"CITE", instructorList);

        assertEquals();
    }
}