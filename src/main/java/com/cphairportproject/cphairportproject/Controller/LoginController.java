package com.cphairportproject.cphairportproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// This is the Controller for the login view!

@Controller
public class LoginController {

    @GetMapping ("/")
    public String loginView(){
        return("login");
    }

}