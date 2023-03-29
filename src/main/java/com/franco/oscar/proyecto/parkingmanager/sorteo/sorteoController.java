package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class sorteoController {
    
    private sorteoService sorteosService;

    public sorteoController(sorteoService sorteosService) {
        this.sorteosService = sorteosService;
    }

    @Autowired
    private sorteoRepository repository;

    @GetMapping("/sorteos")
    public String displaysorteos (Model model) {
        model.addAttribute( "sorteo", repository.findAll());
        return "sorteo/listasorteos";
    }

    @GetMapping("/newsorteo")
    public String showUserCreateForm(Model model) {

        sorteoDao sorteosDao = new sorteoDao();

        model.addAttribute("newsorteo", sorteosDao);

        return "sorteo/newsorteoform";
    }

    @PostMapping("/createsorteo")
    public String createUser(@ModelAttribute sorteoDao sorteosDao) {
        this.sorteosService.register(sorteosDao);
        return "redirect:/sorteos";
    }
}