package com.siva.springboot.tour_project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Tour {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    @Column(length = 2000)
    private String description;
    @Column(length = 2000)
    private String blur;

    private Integer price;
    private String duration;
    @Column(length = 2000)
    private String bullets;
    private String keywords;

    @ManyToOne
    private TourPackage tourPackage;

    @Enumerated
    private Difficulty difficulty;
    @Enumerated
    private Region region;

    public Tour( String title, String description, String blur, Integer price, String duration,
            String bullets, String keywords, TourPackage tourPackage, Difficulty difficulty, Region region) {
        this.title = title;
        this.description = description;
        this.blur = blur;
        this.price = price;
        this.duration = duration;
        this.bullets = bullets;
        this.keywords = keywords;
        this.tourPackage = tourPackage;
        this.difficulty = difficulty;
        this.region = region;
    }

    protected Tour(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlur() {
        return blur;
    }

    public void setBlur(String blur) {
        this.blur = blur;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getBullets() {
        return bullets;
    }

    public void setBullets(String bullets) {
        this.bullets = bullets;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", blur=" + blur + ", price="
                + price + ", duration=" + duration + ", bullets=" + bullets + ", keywords=" + keywords
                + ", tourPackage=" + tourPackage + ", difficulty=" + difficulty + ", region=" + region + "]";
    }

    
    
    

}
