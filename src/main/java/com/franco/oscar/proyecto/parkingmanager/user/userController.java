package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
    
    @Autowired
    private userRepository repository;

    @GetMapping("/usuarios")
    public String displayUsers(Model model) {
        model.addAttribute( "users", repository.getAll());
        return "listausuarios";
    }
}