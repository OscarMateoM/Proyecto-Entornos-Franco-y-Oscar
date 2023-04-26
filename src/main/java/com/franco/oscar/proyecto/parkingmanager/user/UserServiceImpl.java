package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.franco.oscar.proyecto.parkingmanager.core.exceptions.UserExistsException;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Implementacion de service para creacion de formularios de usuarios
 */

@Service
public class UserServiceImpl implements UserService{
    
    private final userRepository UserRepository;

    public UserServiceImpl(userRepository repository) {
        this.UserRepository = repository;
    }

    
    /** 
     * Busca en UserRepository y devuelve informacion
     * @return Iterable<User>
     */
    @Override
    public Iterable<User> getAll() {
        return this.UserRepository.findAll();
    }

    
    /** 
     * Guarda los usuarios que se van creando
     * @param userDao
     */
    @Override
    public void register(UserDao userDao) throws UserExistsException{
        if(userExists(userDao.getemail())) {
            throw new UserExistsException();
        }

        User user = new User();

        BeanUtils.copyProperties(userDao, user);

        this.UserRepository.save(user);
    }


    @Override
    public boolean userExists(String email) {
        return this.UserRepository.findByemail(email) != null ? true : false;
    }
    
}
