package com.example.empadd.service;

import com.example.empadd.entity.Employee;
import com.example.empadd.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee getEmployeeById(int id) {

        Employee employee = employeeRepo.findById(id).get();
        return employee;
    }
}
