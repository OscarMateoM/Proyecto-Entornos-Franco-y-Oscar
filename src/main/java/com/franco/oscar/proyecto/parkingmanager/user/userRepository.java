package com.franco.oscar.proyecto.parkingmanager.user;

import java.util.ArrayList;
import java.util.List;

public class userRepository {
    private ArrayList<User> usuarios;
    public userRepository() {
        usuarios = new ArrayList<>();
    }
    public List<User> getAll() {
        this.usuarios.clear();
        this.usuarios.add(new User("Oscar","Mateo", "Martin", null));
        return this.usuarios;
    }
}
