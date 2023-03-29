package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sorteoController {

    @Autowired
    private sorteoRepository repository;

    @GetMapping("/sorteos")
    public String displayUsers(Model model) {
        model.addAttribute( "sorteo", repository.findAll());
        return "sorteo/listasorteos";
    }
}