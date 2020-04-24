package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Arrivals {

    @Id
    private String expected_date_time;

    private String actual_date_time;

    @ManyToOne
    private Airplanes airplanes;

    @ManyToOne
    private Arrivals arrivals;

    @ManyToOne
    private Gates gates;





}
