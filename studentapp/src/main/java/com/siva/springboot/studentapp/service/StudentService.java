package com.siva.springboot.studentapp.service;

import java.util.List;

import com.siva.springboot.studentapp.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
