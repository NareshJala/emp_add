package com.example.empadd.controller;

import com.example.empadd.entity.Employee;
import com.example.empadd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees/{id}")
    public Employee getEmployees(@PathVariable("id") int id){
       Employee emp = employeeService.getEmployeeById(id);
        return emp;
    }
}
