package com.franco.oscar.proyecto.parkingmanager.user;

import java.util.ArrayList;
import java.util.List;
import org.h2.engine.User;

public class userRepository {
    private ArrayList<User> usuarios;
    public userRepository() {
        usuarios = new ArrayList<>();
    }
    public List<User> getAll() {
        return this.usuarios;
    }
}
