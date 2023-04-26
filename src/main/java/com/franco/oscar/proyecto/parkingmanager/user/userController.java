package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.franco.oscar.proyecto.parkingmanager.core.exceptions.UserExistsException;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Controla la informacion de usuario
 */

@Controller
public class userController {
    
    private UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private userRepository repository;

    
    /** 
     * Muestra la pagina usuarios con la lista de los mismos
     * @param model
     * @return String
     */
    @GetMapping("/usuarios")
    public String displayUsers(Model model) {
        model.addAttribute( "users", repository.findAll());
        return "user/listausuarios";
    }

    
    /** 
     * Muestra la pagina para la creacion de nuevo usuario
     * @param model
     * @return String
     */
    @GetMapping("/newUser")
    public String showUserCreateForm(Model model) {

        UserDao userDao = new UserDao();

        model.addAttribute("newuser", userDao);

        return "user/newuserform";
    }

    
    /** 
     * Redirige a la pagina con la lista de usuarios luego de crear un usuario nuevo
     * @param userDao
     * @return String
     */
    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDao userDao, BindingResult bindingResult, Model model) {
        //Si existe error en correo
        if (bindingResult.hasErrors()) {
            model.addAttribute("userDao", userDao);
            return "user/createform";
        }
        try{
            this.userService.register(userDao);
        } 
        //Lo que muestra cuando ya existe un usuario con ese correo
        catch (UserExistsException exception) {
            model.addAttribute("userDao", userDao);
            bindingResult.reject("email", "Ya existe un usuario con ese correo.");
            return "user/createform";
        }
        return "redirect:/usuarios";
    }
}