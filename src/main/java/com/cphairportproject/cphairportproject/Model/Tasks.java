package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tasks {

    @Id
    private String task_name;

    private int duration_small;
    private int duration_standard;
    private int duration_large;

    @ManyToOne
    private Handling_crews handling_crews;



}
