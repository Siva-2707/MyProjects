package com.siva.goal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.siva.goal.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {
    @Query(value = "select * from employee where FIRST_NAME LIKE ?1% || LAST_NAME LIKE ?1%",
            nativeQuery = true)
    public List<Employee> findByName(String name);

}
