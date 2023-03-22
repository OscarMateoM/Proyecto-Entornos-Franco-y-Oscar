package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    
    private final userRepository UserRepository;

    public UserServiceImpl(userRepository repository) {
        this.UserRepository = repository;
    }

    @Override
    public Iterable<User> getAll() {
        return this.UserRepository.findAll();
    }

    @Override
    public void register(UserDao userDao) {
        
        User user = new User();

        BeanUtils.copyProperties(userDao, user);

        this.UserRepository.save(user);
    }
    
}
