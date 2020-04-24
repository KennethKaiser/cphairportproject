package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Traffic_controllers {

    @Id
    private String traffic_controller_username;
    private String traffic_controller_name;
    private String traffic_controller_type;

    @ManyToOne
    private Airport airport;

}
