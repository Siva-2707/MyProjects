package com.siva.springboot.tour_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.springboot.tour_project.Model.Difficulty;
import com.siva.springboot.tour_project.Model.Region;
import com.siva.springboot.tour_project.Model.Tour;
import com.siva.springboot.tour_project.Model.TourPackage;
import com.siva.springboot.tour_project.Repository.TourPackageRepository;
import com.siva.springboot.tour_project.Repository.TourRepository;

@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }
    protected TourService(){}

    public Tour createTour(String title, String description, String blur, Integer price, String duration,
    String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findById(tourPackageName)
                                                       .orElseThrow(() -> new RuntimeException("Tour package does not exit. "+tourPackageName));
        return tourRepository.save(new Tour(title,description,blur,price,duration,bullets,keywords,tourPackage,difficulty,region));
    }

    public long total(){
        return tourRepository.count();
    }
    public Object createTour(String title, String description, String blurb, String price, String length,
            String bullets, String keywords, String packageType, String difficulty, String region) {
        return null;
    }
    
}
