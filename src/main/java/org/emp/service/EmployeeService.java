package org.emp.service;

import org.emp.dto.Employee;
import org.emp.dto.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<EmployeeEntity> getAll();
}
