package com.example.gtics_lab5_20181526.controller;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(value = "/")
    public String gticscontroller(){
        return "Vista_Inicio";
    }
}
