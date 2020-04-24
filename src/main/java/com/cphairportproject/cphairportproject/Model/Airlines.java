package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Airlines {

    @Id
    private String airline_code;
    private String airline_name;
    private int airline_tel;

    @ManyToOne
    private Terminal terminal;

    @ManyToOne
    private Handling_companies handling_companies;

    @ManyToOne
    private Airport airport;






}
