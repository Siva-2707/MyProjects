package com.siva.springboot.tour_project.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class TourRatingPk implements Serializable {
    @ManyToOne
    private Tour tour;
    
    @Column(insertable = false, updatable = false,nullable = false)
    private Integer customerId;

    public TourRatingPk(){}

    public TourRatingPk(Tour tour, Integer customerId) {
        this.tour = tour;
        this.customerId = customerId;
    }

    public Tour getTour() {
        return tour;
    }
    public Integer getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "TourRatingPk [tour=" + tour + ", customerId=" + customerId + "]";
    }
    
    

}
