package com.franco.oscar.proyecto.parkingmanager.user;

import com.franco.oscar.proyecto.parkingmanager.core.exceptions.UserExistsException;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Service de usuario para formulario
 */

public interface UserService {

    public Iterable<User> getAll();

    public void register(UserDao userDao) throws UserExistsException;

    public boolean userExists(String email);

}
