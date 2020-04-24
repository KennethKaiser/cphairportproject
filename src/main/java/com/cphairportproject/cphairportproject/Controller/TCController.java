package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//This is the Controller for the view(s) what are available for the Traffic Controller

@Controller
public class TCController {


    @GetMapping("/trafficController")
    public String trafficControllerView(){
        return "trafficController";
    }

}