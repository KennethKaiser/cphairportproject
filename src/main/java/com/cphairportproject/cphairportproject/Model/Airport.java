package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {

    @Id
    private String code;

    private String city_name;
    private String country;


}
