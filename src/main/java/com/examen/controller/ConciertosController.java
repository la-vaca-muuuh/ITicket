package com.examen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConciertosController {
    
        @GetMapping ({"/","/concirtos"})
    public String index(){
        return "login";
    }
}
