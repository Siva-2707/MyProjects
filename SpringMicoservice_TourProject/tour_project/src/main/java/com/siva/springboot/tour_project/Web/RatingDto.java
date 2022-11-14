package com.siva.springboot.tour_project.Web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.siva.springboot.tour_project.Model.TourRating;

public class RatingDto {
    
    @Min(0) @Max(5)
    private Integer score;
    @Size(max = 255)
    private String comment;
    @NotNull
    private Integer customerId;
    
    public RatingDto(TourRating tourRating){
        this(tourRating.getScore(), tourRating.getComment(),tourRating.getPk().getCustomerId());
    }

    private RatingDto(Integer score, String comment, Integer customerId) {
        this.score = score;
        this.comment = comment;
        this.customerId = customerId;
    }

    
    protected RatingDto(){}


    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    


}
