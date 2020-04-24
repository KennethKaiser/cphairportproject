package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Terminal {

    @Id
    private int terminal_number;

    @ManyToOne
    private Airport airport;

}
