package com.siva.goal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siva.goal.model.Employee.Employee;
import com.siva.goal.service.EmployeeService;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Get all the employees
    @GetMapping("/allEmployees")
    public String getEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }

    // Get employee by Id
    @GetMapping("employee/{id}")
    public String getEmployee(@RequestParam(name = "id") int id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeWithCode(id));
        return "employee";
    }

    // Going to create employee page
    @GetMapping("/createEmployee")
    public String createEmployeeForm(Model model) {
        return "employee";
    }

    @ModelAttribute("employee")
    public Employee getEmployee() {
        return new Employee();
    }

    // Creating a new employee
    @PostMapping("/create")
    public String createEmployee(@Valid @ModelAttribute(name = "employee") Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/allEmployees";
    }

    // Deleting a employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@RequestParam(name = "id") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/allEmployees";

    }

    // Searching a employee whith his name
    @GetMapping("/search")
    public String searchEmployee(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("employees", employeeService.findByName(name));
        return "employees";
    }

    // Updating a employee
    // @PatchMapping("/update")
    // public String updateEmployee(@RequestParam(name="id")int id, Model model){

    // }
}
