package com.siva.goal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siva.goal.model.Employee;
import com.siva.goal.service.EmployeeService;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/allEmployees")
    public String getEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }

    @GetMapping()
    public String getEmployee(@RequestParam(name = "id") int id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeWithCode(id));
        return "employee";
    }

    @GetMapping("/createEmployee")
    public String createEmployeeForm(Model model) {
        return "createEmployee";
    }

    @ModelAttribute("employee")
    public Employee getEmployee() {
        return new Employee();
    }

    @PostMapping("/create")
    public String createEmployee(@Valid @ModelAttribute(name = "employee") Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/allEmployees";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@RequestParam(name = "id") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/allEmployees";

    }

    @GetMapping("/search")
    public String searchEmployee(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("employees", employeeService.findByName(name));
        return "employees";
    }
}
