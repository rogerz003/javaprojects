package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {

    public Employee getEmployeeDetails() {
        Employee employee = new Employee();
        employee.setName("Alice");
        employee.setEmployeeId(101);
        return employee;
    }
}
