package com.siva.springboot.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.springboot.studentapp.model.Student;

public interface StudentRepository  extends JpaRepository<Student,Long> {
}
