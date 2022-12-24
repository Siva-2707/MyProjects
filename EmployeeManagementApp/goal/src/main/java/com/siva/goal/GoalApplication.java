package com.siva.goal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoalApplication {

	// private final EmployeeService employeeService;

	// @Autowired
	// public GoalApplication(EmployeeService employeeService) {
	// 	this.employeeService = employeeService;
	// }

	public static void main(String[] args) {
		SpringApplication.run(GoalApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Siva");
		employee.setLastName("Bala");
		employee.setGender(Gender.MALE);
		employee.setEmail("siva@gmail.com");
		// List<EducationBackground> list = employee.getEducationBackgrounds();
		FamilyDetails familyDetails = new FamilyDetails();
		Member member = new Member(Relationship.FATHER, "Bala", Gender.MALE, null, null, null);
		employee.setFamilyDetails(familyDetails);
		employee.getFamilyDetails().setMembers(new ArrayList<>());
		employee.getFamilyDetails().getMembers().add(member);
		// list.add(new EducationBackground("SMVEC", 5, "2021", 85));
		// list.add(new EducationBackground("AHSS", 5, "2017", 95));
		// employee.setEducationBackgrounds(list);
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber("1245");
		bankAccount.setBranch("PY");
		employee.getBankAccounts().add(bankAccount);
		employeeService.createEmployee(employee);
	
		// Employee empl = employeeService.getEmployeeWithCode(1);
		// List<BankAccount> accounts = empl.getBankAccounts();
		// if (accounts != null)
		// 	System.out.println(accounts.get(0));
		// // System.out.println(empl);
	
	}
	
	*/
}
