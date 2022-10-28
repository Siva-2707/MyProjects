package com.siva.springboot.studentapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.springboot.studentapp.model.Student;
import com.siva.springboot.studentapp.repository.StudentRepository;
import com.siva.springboot.studentapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
    
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        
        return studentRepository.findAll();
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }


    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    
    
}
