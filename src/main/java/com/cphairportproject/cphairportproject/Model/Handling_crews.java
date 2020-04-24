package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Handling_crews {

    @Id
    private String handling_crew_type;

    @ManyToOne
    private Handling_companies handling_companies;
}
