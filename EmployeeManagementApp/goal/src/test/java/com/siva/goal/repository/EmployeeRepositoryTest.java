package com.siva.goal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.siva.goal.model.Employee.Employee;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @AfterEach
    void tearDown() {
        employeeRepository.deleteAll();
    }

    @Test
    void searchFilterShouldWork() {
        //given
        Employee employee = new Employee();
        String firstName = "Siva";
        employee.setFirstName(firstName);
        employee.setLastName("Rajesh");
        employee.setEmail("b.siva@gmail.com");
        employeeRepository.save(employee);
        //when
        boolean doesfirstNameExist = employeeRepository.findByName("Siva").isEmpty();
        boolean doesLastNameExist = employeeRepository.findByName("Rajesh").isEmpty();
        //then
        assertEquals(true, doesfirstNameExist);
        assertEquals(true, doesLastNameExist);
    }

    @Test
    void searchFilterShouldNotWork() {
        //given
        String firstName = "Siva";
        //when
        boolean firstNamedoesNotExist = employeeRepository.findByName(firstName).isEmpty();
        //then
        assertEquals(true, firstNamedoesNotExist);
    }
}
