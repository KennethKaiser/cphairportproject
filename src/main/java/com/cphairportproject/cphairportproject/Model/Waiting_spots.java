package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Waiting_spots {

    @Id
    private int waiting_spot_id;

    @OneToOne
    private Airplanes airplanes;

}
