package com.siva.springboot.tour_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.springboot.tour_project.Model.TourPackage;
import com.siva.springboot.tour_project.Repository.TourPackageRepository;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code,String name){
        return tourPackageRepository.findById(code)
                                    .orElse(tourPackageRepository
                                    .save(new TourPackage(code, name)));
    }

    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }   

    public long total(){
        return tourPackageRepository.count();
    }






    
}
