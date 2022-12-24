package com.siva.goal.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {

    private String street;

    private String city;

    private String state;

    private String pincode;
}
