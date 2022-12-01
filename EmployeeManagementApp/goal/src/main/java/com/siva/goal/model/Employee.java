package com.siva.goal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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

        @Embedded
        @AttributeOverrides({
                        @AttributeOverride(name = "doorNumber", column = @Column(name = "home_door_number")),
                        @AttributeOverride(name = "street", column = @Column(name = "home_street")),
                        @AttributeOverride(name = "city", column = @Column(name = "home_city")),
                        @AttributeOverride(name = "pincode", column = @Column(name = "home_pincode"))
        })
        private Address homeAddress;
        @Embedded
        @AttributeOverrides({
                        @AttributeOverride(name = "doorNumber", column = @Column(name = "office_door_number")),
                        @AttributeOverride(name = "street", column = @Column(name = "office_street")),
                        @AttributeOverride(name = "city", column = @Column(name = "office_city")),
                        @AttributeOverride(name = "pincode", column = @Column(name = "office_pincode"))
        })
        private Address officeAddress;
        @Embedded
        private List<Contact> contacts;

        private String desigination;

        private Date dateOfBirth;

        @Transient
        private int empAge;

        @Column(nullable = false)
        private String email;

        private String department;

        private Date dateOfJoining;

        @Transient
        private int currentCompanyExperience;

        private int totalExperience;

        @OneToMany(targetEntity = EducationBackground.class, cascade = CascadeType.ALL)
        @JoinColumn(name = "emp_id", referencedColumnName = "id")
        private List<EducationBackground> educationBackgrounds = new ArrayList<>();

        public Employee(String firstName, String lastName, Address homeAddress, Address officeAddress,
                        List<Contact> contacts,
                        String desigination, Date dateOfBirth, int empAge, String email, String department,
                        Date dateOfJoining,
                        int currentCompanyExperience, int totalExperience,
                        List<EducationBackground> educationBackgrounds) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.homeAddress = homeAddress;
                this.officeAddress = officeAddress;
                this.contacts = contacts;
                this.desigination = desigination;
                this.dateOfBirth = dateOfBirth;
                this.empAge = empAge;
                this.email = email;
                this.department = department;
                this.dateOfJoining = dateOfJoining;
                this.currentCompanyExperience = currentCompanyExperience;
                this.totalExperience = totalExperience;
                this.educationBackgrounds = educationBackgrounds;
        }

}
