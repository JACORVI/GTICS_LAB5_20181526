package com.example.gtics_lab5_20181526.controller;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(value = "/Vista_Inicio")
    public String gticscontroller(){
        return "Vista_Inicio";
    }
    @GetMapping(value = "/Vista_Inicio/Gestion_Tecnicos")
    public String gticstecnico(){
        return"Vista_Inicio/Gestion_Tecnicos";
    }
}
