package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {
    
    private UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private userRepository repository;

    @GetMapping("/usuarios")
    public String displayUsers(Model model) {
        model.addAttribute( "users", repository.findAll());
        return "user/listausuarios";
    }

    @GetMapping("/newUser")
    public String showUserCreateForm(Model model) {

        UserDao userDao = new UserDao();

        model.addAttribute("newuser", userDao);

        return "user/newuserform";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDao userDao) {
        this.userService.register(userDao);
        return "redirect:/usuarios";
    }
}