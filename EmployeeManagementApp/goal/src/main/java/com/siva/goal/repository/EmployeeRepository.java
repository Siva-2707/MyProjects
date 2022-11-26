package com.siva.goal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.goal.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {
    
}
