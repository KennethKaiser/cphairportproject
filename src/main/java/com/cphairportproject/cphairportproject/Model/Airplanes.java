package com.cphairportproject.cphairportproject.Model;

import javax.persistence.*;

@Entity
public class Airplanes {

    @Id
    private String airplane_code;

    @OneToOne
    private Waiting_spots waiting_spots;

    @OneToOne
    private Airplane_models airplane_models;

    @ManyToOne
    private Airlines airlines;






}
