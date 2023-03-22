package com.franco.oscar.proyecto.parkingmanager.user;

public interface UserService {

    public Iterable<User> getAll();

    public void register(UserDao userDao);

}
