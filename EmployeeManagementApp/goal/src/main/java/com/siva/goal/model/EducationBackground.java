package com.siva.goal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMP_EDU_BGRND")
@Getter
@Setter
@NoArgsConstructor
public class EducationBackground {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String institute;
    private int courseDuration;
    private String yearOfPassing;
    private double percentage;

    public EducationBackground(String institute, int courseDuration, String yearOfPassing, double percentage) {
        this.institute = institute;
        this.courseDuration = courseDuration;
        this.yearOfPassing = yearOfPassing;
        this.percentage = percentage;
    }

    


    

}
