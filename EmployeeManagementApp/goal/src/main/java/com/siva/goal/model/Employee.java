package com.siva.goal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

import lombok.ToString;


@Entity(name = "Employee")
@ToString
@Table(
    name = "EMPLOYEE",
    uniqueConstraints = {
        @UniqueConstraint(name = "emp_email_unique", columnNames = "EMAIL")
    }
)
public class Employee {

    @Id
    @SequenceGenerator(
        name = "EmployeeSequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "EmployeeSequence"
        )
    @Column(
        name = "ID",
        updatable = false
        )
    private int id;


    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
    @Column(name = "ADDRESS_1")
    private String address1;

    @Column(name = "ADDRESS_2")
    private String address2;

    
    @Column(name = "CONTACT1")
    private String contact1;

    @Column(name = "CONTACT2")
    private String contact2;

    @Column(name = "DESIGINATION")
    private String desigination;

    @Column(name = "DOB")
    private Date dateOfBirth;

    @Transient
    private int empAge;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "DEPARTMENT")
    private String department;


    @Column(name = "DATE_OF_JOINING")
    private Date dateOfJoining;

    @Transient
    private int currentCompanyExperience;
    
    @Column(name = "TOTAL_EXPERIENCE")
    private int totalExperience;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMP_ID_FK")
    private List<EducationBackground> educationBackgrounds = new ArrayList<>();
    
    

    public Employee(String firstName, String lastName, String address1, String address2, String contact1,
            String contact2, String desigination, Date dateOfBirth, String email, String department, Date dateOfJoining,
            int totalExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.contact1 = contact1;
        this.contact2 = contact2;
        this.desigination = desigination;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.totalExperience = totalExperience;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getDesigination() {
        return desigination;
    }

    public void setDesigination(String desigination) {
        this.desigination = desigination;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getCurrentCompanyExperience() {
        return currentCompanyExperience;
    }

    public void setCurrentCompanyExperience(int currentCompanyExperience) {
        this.currentCompanyExperience = currentCompanyExperience;
    }

    public int getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }

    public List<EducationBackground> getEducationBackgrounds() {
        return educationBackgrounds;
    }

    public void setEducationBackgrounds(List<EducationBackground> educationBackgrounds) {
        this.educationBackgrounds = educationBackgrounds;
    }

    
    

    
   
}
