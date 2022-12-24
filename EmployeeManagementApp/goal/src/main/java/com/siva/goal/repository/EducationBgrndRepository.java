package com.siva.goal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.goal.model.Employee.EducationBackground;

public interface EducationBgrndRepository extends JpaRepository<EducationBackground, Integer> {

}