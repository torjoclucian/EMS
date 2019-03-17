package com.employment.training.employeemanagementsystem.controller;

import com.employment.training.employeemanagementsystem.entity.Employee;
import com.employment.training.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/byDepartment")
    public List<Employee> getAllEmployeesByName(@RequestParam(name = "name") String name) {
        return employeeService.getAllCarriersByName(name);
    }

    @GetMapping(value = "/countAllByDepartment")
    public long countAllEmployeesByDepartment(@RequestParam(name = "name") String name) {
        return employeeService.countTotalEmployeesByDepartment(name);
    }

    @GetMapping(value = "/totalNumberOfEmployees")
    public long countAllEmployeesByDepartment() {
        return employeeService.getTotalEmployeeCount();
    }

}
