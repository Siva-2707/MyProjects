package com.siva.springboot.tour_project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.siva.springboot.tour_project.Model.TourPackage;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends JpaRepository<TourPackage, String> {
    Optional<TourPackage> findByName(String name);
}
