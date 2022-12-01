package com.siva.goal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.siva.goal.model.EducationBackground;
import com.siva.goal.model.Employee;
import com.siva.goal.service.EmployeeService;

@SpringBootApplication
public class GoalApplication implements CommandLineRunner {

	private final EmployeeService employeeService;

	@Autowired
	public GoalApplication(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(GoalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Siva");
		employee.setLastName("Bala");
		employee.setEmail("siva@gmail.com");
		List<EducationBackground> list = employee.getEducationBackgrounds();
		list.add(new EducationBackground("SMVEC", 5, "2021", 85));
		list.add(new EducationBackground("AHSS", 5, "2017", 95));
		employee.setEducationBackgrounds(list);
		employeeService.createEmployee(employee);
	}
}
