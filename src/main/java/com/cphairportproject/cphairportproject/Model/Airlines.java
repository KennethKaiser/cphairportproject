package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airlines {

    @Id
    private String airline_code;
    private String airline_name;
    private int airline_tel;



}
