package com.employment.training.employeemanagementsystem.service;

import com.employment.training.employeemanagementsystem.entity.Employee;
import com.employment.training.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getAllCarriersByName(String name) {
        return employeeRepository.findByDepartment(name);
    }

    public long getTotalEmployeeCount() {
        return employeeRepository.count();
    }

    public long countTotalEmployeesByDepartment(String name) {
        return employeeRepository.countAllByDepartment(name);
    }
}
