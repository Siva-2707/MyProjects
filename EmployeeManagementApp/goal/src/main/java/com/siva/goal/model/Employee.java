package com.siva.goal.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Employee")
@ToString
@Table(name = "EMPLOYEE", uniqueConstraints = {
                @UniqueConstraint(name = "emp_email_unique", columnNames = "email")
})
@Getter
@Setter
@NoArgsConstructor
public class Employee {

        @Id
        @SequenceGenerator(name = "EmployeeSequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmployeeSequence")
        @Column(updatable = false)
        private int id;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        private String gender;

        private String address;

        private String city;

        private String state;

        private String pincode;

        @Embedded
        private List<Contact> contacts = new ArrayList<>();

        private String desigination;

        private LocalDate dateOfBirth;

        @Transient
        private int empAge;

        @Column(nullable = false)
        private String email;

        private String department;

        private LocalDate dateOfJoining;

        @Transient
        private int currentCompanyExperience;

        private int totalExperience;

        @OneToMany(targetEntity = EducationBackground.class, cascade = CascadeType.ALL)
        @JoinColumn(name = "emp_id", referencedColumnName = "id")
        private List<EducationBackground> educationBackgrounds = new ArrayList<>();

        public int getEmpAge() {
                return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }

        public int getCurrentCompanyExperience() {
                return Period.between(dateOfJoining, LocalDate.now()).getYears();
        }

}
