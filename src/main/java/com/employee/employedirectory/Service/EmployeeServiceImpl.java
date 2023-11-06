package com.employee.employedirectory.Service;

import com.employee.employedirectory.Entity.Employee;
import com.employee.employedirectory.dao.EmployeeDAO;
import com.employee.employedirectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeedao){
        employeeDAO = theEmployeedao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Long theId) {
        return null;
    }


}
