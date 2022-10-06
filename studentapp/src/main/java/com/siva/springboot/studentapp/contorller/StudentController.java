package com.siva.springboot.studentapp.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.siva.springboot.studentapp.model.Student;
import com.siva.springboot.studentapp.service.StudentService;

@Controller
public class StudentController {
    
    private StudentService studentService;

    @Autowired // If there is only one constructor, we need not autowire it.
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Handeller methods.
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "createStudentForm";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/update/{id}")
    public String updateStudentForm(@PathVariable Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "updateStudentForm";
    }

    @PostMapping("/students/update/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student){
        student.setId(id);
        studentService.updateStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
