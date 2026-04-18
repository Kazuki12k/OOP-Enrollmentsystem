package org.example.service;

import org.example.model.Department;

import java.util.*;

public interface DepartmentREG {
    void saveDepartment(Department department);

    public interface DepartmentRegistration {
        void saveDepartment(Department department);
        List<Department> displayAll();
    }
}
