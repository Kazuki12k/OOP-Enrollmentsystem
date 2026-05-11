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
    public void updateDepartment(Department department) {
        for(int i = 0; i < departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID().equals(department.getDepartmentID())){
                departmentList.set(i, department);
                break;
            }
        }
    }
    public void deleteDepartment(Department department) {
        for(int i = 0; i < departmentList.size(); i++){
            if(departmentList.get(i).getDepartmentID() == (department.getDepartmentID())){
                departmentList.remove(i);
                break;
            }
        }
    }

    public List<Department> displayDepartments() {
        return departmentList.stream().toList();
    }


}
