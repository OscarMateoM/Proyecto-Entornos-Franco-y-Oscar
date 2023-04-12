package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Controla el sorteo
 */

@Controller
public class sorteoController {
    
    private sorteoService sorteosService;

    public sorteoController(sorteoService sorteosService) {
        this.sorteosService = sorteosService;
    }

    @Autowired
    private sorteoRepository repository;

    
    /** 
     * Muestra la pagina sorteos con la lista de los mismos
     * @param model
     * @return String
     */
    @GetMapping("/sorteos")
    public String displaysorteos (Model model) {
        model.addAttribute( "sorteo", repository.findAll());
        return "sorteo/listasorteos";
    }

    
    /** 
     * Muestra la pagina para la creacion de nuevo sorteo
     * @param model
     * @return String
     */
    @GetMapping("/newsorteo")
    public String showUserCreateForm(Model model) {

        sorteoDao sorteosDao = new sorteoDao();

        model.addAttribute("newsorteo", sorteosDao);

        return "sorteo/newsorteoform";
    }

    
    /** 
     * Redirecciona a la pagina con la lista de sorteos luego de crear nuevo
     * @param sorteosDao
     * @return String
     */
    @PostMapping("/createsorteo")
    public String createUser(@ModelAttribute sorteoDao sorteosDao) {
        this.sorteosService.register(sorteosDao);
        return "redirect:/sorteos";
    }
}