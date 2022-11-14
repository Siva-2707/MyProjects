package com.siva.springboot.tour_project.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class TourRating{

    @EmbeddedId
    private TourRatingPk pk;

    @Column(nullable = false)
    private Integer score;

    private String comment;
    
    protected TourRating(){}

    public TourRating(TourRatingPk pk, Integer score, String comment) {
        this.pk = pk;
        this.score = score;
        this.comment = comment;
    }

    public TourRatingPk getPk() {
        return pk;
    }

    public void setPk(TourRatingPk pk) {
        this.pk = pk;
    }

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

    @Override
    public String toString() {
        return "TourRating [pk=" + pk + ", score=" + score + ", comment=" + comment + "]";
    }

    public TourRating orElseThrow(Object object) {
        return null;
    }

    
    

}