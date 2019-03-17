package com.employment.training.employeemanagementsystem.repository;

import com.employment.training.employeemanagementsystem.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByDepartment(String name);

    List<Employee> findAll();

    long countAllByDepartment(String department);
}
