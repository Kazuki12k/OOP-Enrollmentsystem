package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRegistration implements DepartmentREG {
    List<Department> departmentList;
    List<Instructor> instructorList;

    public DepartmentRegistration() {
        this.departmentList = new ArrayList<>();
        this.instructorList = new ArrayList<>();
    }

    public void saveDepartment(Department department){
            departmentList.add(department);
    }

    public List<Department> displayAll() {
        return departmentList.stream().toList();
    }


}
