package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class userController {
    
    private userRepository repository = new userRepository();

    @GetMapping("/usuarios")
    public String displayUsers(Model model) {
        model.addAttribute( "usuarios", repository.getAll());
        return "listausuarios";
    }
}
