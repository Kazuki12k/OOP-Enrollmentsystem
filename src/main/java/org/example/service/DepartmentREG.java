package org.example.service;

import org.example.model.Department;

import java.util.*;

public interface DepartmentREG {
    void saveDepartment(Department department);
    void updateDepartment(Department department);
    void deleteDepartment(Department department);
    List<Department> displayDepartments();
}
