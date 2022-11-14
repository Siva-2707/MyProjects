package com.siva.springboot.tour_project.Web;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.siva.springboot.tour_project.Model.Tour;
import com.siva.springboot.tour_project.Model.TourRating;
import com.siva.springboot.tour_project.Model.TourRatingPk;
import com.siva.springboot.tour_project.Repository.TourRatingRepository;
import com.siva.springboot.tour_project.Repository.TourRepository;

@RestController
@RequestMapping(path = "/tours/{tourId}/ratings")
public class TourRatingController {
    
    private TourRatingRepository tourRatingRepository; 
    private TourRepository tourRepository;

    @Autowired
    public TourRatingController(TourRatingRepository tourRatingRepository, TourRepository tourRepository) {
        this.tourRatingRepository = tourRatingRepository;
        this.tourRepository = tourRepository;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createTourRating(@PathVariable(value = "tourId") int tourId, @RequestBody @Validated RatingDto ratingDto){
        Tour tour = validateTour(tourId);
        tourRatingRepository.save(new TourRating(new TourRatingPk(tour, ratingDto.getCustomerId()), ratingDto.getScore(), ratingDto.getComment()));
        
    }
    @GetMapping
    public List<RatingDto> getAllRatingsForTour(@PathVariable(value = "tourId") int tourId){
        validateTour(tourId);
        // tourRatingRepository.findByPkTourId(tourId).forEach(System.out::println);
        
        return tourRatingRepository.findByPkTourId(tourId).stream().map(RatingDto::new).collect(Collectors.toList());
    }
    @GetMapping(path = "/average")
    public Map<String,Double> getAverageRatingForTour(@PathVariable(value = "tourId") int tourId){
        validateTour(tourId);
        return Map.of("Average", tourRatingRepository.findByPkTourId(tourId).stream().mapToInt(TourRating::getScore).average().orElseThrow(()-> new NoSuchElementException("No tour with Tour ID: "+ tourId)));
    }
    private Tour validateTour(int tourId) {
        return tourRepository.findById(tourId).orElseThrow(() -> new NoSuchElementException("No tour exists with ID: "+tourId));
    }
    @PutMapping
    public RatingDto updateRating(@PathVariable(value="tourId") int tourId, @RequestBody @Validated RatingDto ratingDto){
        TourRating rating = validateRating(tourId, ratingDto.getCustomerId());
        rating.setComment(ratingDto.getComment());
        rating.setScore(ratingDto.getScore());
        return new RatingDto(tourRatingRepository.save(rating));
    }
    @PatchMapping
    public RatingDto updateRatingPatch(@PathVariable(value="tourId") int tourId, @RequestBody @Validated RatingDto ratingDto){
        TourRating rating = validateRating(tourId, ratingDto.getCustomerId());
        rating.setComment(ratingDto.getComment());
        rating.setScore(ratingDto.getScore());
        return new RatingDto(tourRatingRepository.save(rating));
    }

    @DeleteMapping(path = "/{customerId}")
    public void deleteRating(@PathVariable(value="tourId") int tourId, @PathVariable(value = "customerId") int customerId){
        TourRating rating = validateRating(tourId, customerId);
        tourRatingRepository.delete(rating);
    }
    private TourRating validateRating(int tourId, int customerId){
        return tourRatingRepository.findByPkTourIdAndPkCustomerId(tourId, customerId).orElseThrow(()-> new NoSuchElementException("No rating present for Tour ID: "+ tourId+" and for Customer ID: "+customerId)); 
    }

}
