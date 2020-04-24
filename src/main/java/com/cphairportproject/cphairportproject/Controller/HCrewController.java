package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//This is the Controller for the view(s), that are available for the Handling Crew!

@Controller
public class HCrewController {

   /* @GetMapping ("/")
    public String HCrewView(){
        return "/";
    } */

    //This mapping is the view available for the Luggage Crew!
    @GetMapping ("/luggageCrew")
    public String luggageView(){
        return "/luggageCrew";
    }

    //This mappingg is the view available for the Passager Crew!
    @GetMapping ("/passagerCrew")
    public String passagerCrewView(){
        return "/passagerCrew";
    }

    //Thsi mapping the view available for the Fuel Crew!
    @GetMapping("/fuelCrew")
    public String fuelCrewView(){
        return "/fuelCrew";
    }
}
