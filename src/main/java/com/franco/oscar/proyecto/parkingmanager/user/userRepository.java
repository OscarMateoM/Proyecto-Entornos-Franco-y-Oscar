package com.franco.oscar.proyecto.parkingmanager.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

public class userRepository {
    private ArrayList<User> usuarios;
    public userRepository() {
        usuarios = new ArrayList<>();
    }
    public List<User> getAll() {
        this.usuarios.clear();
        this.usuarios.add(new User("email: aomatmar964@g.educaand.es","name: Oscar Mateo Martin"));
        return this.usuarios;
    }
}
