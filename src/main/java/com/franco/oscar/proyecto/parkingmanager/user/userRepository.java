package com.franco.oscar.proyecto.parkingmanager.user;

import java.util.ArrayList;
import java.util.List;
import java.util.list;

import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

public class userRepository {
    private ArrayList<User> usuarios;
    public userRepository() {
        usuarios = new ArrayList<>();
    }
    public List<User> getAll() {
        return this.usuarios;
    }
}
