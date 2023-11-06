package com.employee.employedirectory.dao;

import com.employee.employedirectory.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(Long  id);


    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
