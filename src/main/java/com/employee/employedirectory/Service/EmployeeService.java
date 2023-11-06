package com.employee.employedirectory.Service;

import com.employee.employedirectory.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Long theID);


}
