package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gates {

    @Id
    private int gate_number;

    private int gate_size;
    private boolean gate_status;

    @ManyToOne
    private Terminal terminal;





}
