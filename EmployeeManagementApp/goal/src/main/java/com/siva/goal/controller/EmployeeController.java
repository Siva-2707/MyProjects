package com.siva.goal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siva.goal.model.Employee;
import com.siva.goal.service.EmployeeService;

@Controller
@RequestMapping("/employee")
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
        model.addAttribute("employee", new Employee());
        return "createEmployee";
    }

    @PostMapping("/create")
    public String createEmployee(@ModelAttribute(name = "employee") Employee employee, Model model) {
        employeeService.createEmployee(employee);
        return "redirect:/employee/allEmployees";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@RequestParam(name = "id") int id, Model model) {
        employeeService.deleteEmployee(id);
        return "redirect:/employee/allEmployees";

    }
}
