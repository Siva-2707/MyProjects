package com.siva.goal.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.siva.goal.model.Employee.Employee;
import com.siva.goal.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    private EmployeeService employeeService;
    // private AutoCloseable mocks;
    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        // mocks = MockitoAnnotations.openMocks(this);
        employeeService = new EmployeeService(employeeRepository);
    }

    // @AfterEach
    // void tearDown() throws Exception {
    //     mocks.close();
    // }

    @Test
    void canCreateEmployee() {
        //Given
        Employee employee = new Employee();
        employee.setFirstName("Siva");
        employee.setLastName("rajesh");
        employee.setEmail("b.siva@gmail.com");

        //when
        employeeService.createEmployee(employee);

        //then
        ArgumentCaptor<Employee> employeeArgumentCaptor = ArgumentCaptor.forClass(Employee.class); //To check if the same employee is saved.
        verify(employeeRepository).save(employeeArgumentCaptor.capture());

        Employee capturedEmployee = employeeArgumentCaptor.getValue();
        assertEquals(employee, capturedEmployee);

    }

    @Test
    void canDeleteEmployee() {
        //Given 

        //When

        //Then

    }

    @Test
    void testFindByName() {

    }

    @Test
    void testGetAllEmployees() {

    }

    @Test
    void testGetEmployeeWithCode() {

    }
}
