package com.siva.springboot.tour_project.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.siva.springboot.tour_project.Model.TourRating;
import com.siva.springboot.tour_project.Model.TourRatingPk;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends JpaRepository<TourRating,TourRatingPk>{
    List<TourRating> findByPkTourId(Integer tourId);

    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);
}
