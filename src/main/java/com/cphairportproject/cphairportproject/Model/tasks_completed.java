package com.cphairportproject.cphairportproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class tasks_completed {

    @Id
    private int task_completed_id;

    private String start_date_time;
    private String end_date_time;

    @ManyToOne
    private Handling_crews handling_crews;

    @ManyToOne
    private Tasks tasks;

    @ManyToOne
    private Departures departures;

    @ManyToOne
    private Arrivals arrivals;




}
