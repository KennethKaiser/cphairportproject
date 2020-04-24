package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airplane_models {

    @Id
    private String IATA_code;
    private String model;
    private String size;


}
