package com.siva.goal.model.Family;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.siva.goal.model.Contact;
import com.siva.goal.model.Enum.Gender;
import com.siva.goal.model.Enum.Relationship;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Relationship relationship;
    private String name;
    private Gender gender;
    private Contact contact;
    private String qualification;
    private String currentCompany;

    public Member(Relationship relationship, String name, Gender gender, Contact contact, String qualification,
            String currentCompany) {
        this.relationship = relationship;
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.qualification = qualification;
        this.currentCompany = currentCompany;
    }

}
