package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Departures {

    @Id
    private String expected_date_time;
    private String actual_date_time;

    @ManyToOne
    private Departures departures;

    @ManyToOne
    private Airport airport;

    @ManyToOne
    private Gates gates;

}
