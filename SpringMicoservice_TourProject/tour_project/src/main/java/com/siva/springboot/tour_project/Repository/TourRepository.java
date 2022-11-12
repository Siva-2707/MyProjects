package com.siva.springboot.tour_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.springboot.tour_project.Model.Tour;

public interface TourRepository extends JpaRepository<Tour,Integer>{
}
