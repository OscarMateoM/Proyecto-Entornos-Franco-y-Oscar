package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String createUser(@ModelAttribute UserDao userDao) {
        try{
            this.userService.register(userDao);
        } 
        catch (UserExistsException exception) {
            return "user/createform";
        }
        return "redirect:/usuarios";
    }
}