package com.siva.goal.model.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EducationBackground {
    @Id
    @SequenceGenerator(name = "eduBgrnd_seq_generator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String courseName;
    private String institute;
    private String university;
    private int courseDuration;
    private String yearOfPassing;
    private double percentage;

    public EducationBackground(String courseName, String institute, String university, int courseDuration,
            String yearOfPassing, double percentage) {
        this.courseName = courseName;
        this.institute = institute;
        this.university = university;
        this.courseDuration = courseDuration;
        this.yearOfPassing = yearOfPassing;
        this.percentage = percentage;
    }

}
