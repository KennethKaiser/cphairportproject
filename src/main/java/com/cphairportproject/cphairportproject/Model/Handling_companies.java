package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Handling_companies {

    @Id
    private int handling_comp_id;

    private String handling_comp_name;

    @OneToOne
    private Airlines airlines;

}
