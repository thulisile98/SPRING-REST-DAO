package com.employee.employedirectory.rest;

import com.employee.employedirectory.Entity.Employee;
import com.employee.employedirectory.Service.EmployeeService;
import com.employee.employedirectory.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //construcyor enjection
    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    //expose employees end point and return a list of employees
    @GetMapping("/employee")
    public List<Employee> findAll(){
        return     employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    Employee findById(@PathVariable Long theId){
        return     employeeService.findById(theId);

    }



}
