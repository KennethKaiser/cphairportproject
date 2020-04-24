package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PilotController {

    @GetMapping ("/pilot")
    public String pilotView(){
        return "pilot";
    }
}