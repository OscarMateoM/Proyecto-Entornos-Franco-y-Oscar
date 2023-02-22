package com.franco.oscar.proyecto.parkingmanager.user;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
@Repository 
public class userRepository {
    private ArrayList<User> usuarios;
    public userRepository() {
        usuarios = new ArrayList<>();
    }
    public List<User> getAll() {
        this.usuarios.clear();
        this.usuarios.add(new User("Oscar","Mateo", "Martin", null));
        this.usuarios.add(new User("Franco Tomas","Casco", null, null));
        return this.usuarios;
    }
}
