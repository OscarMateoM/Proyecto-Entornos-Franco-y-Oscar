package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class sorteoServiceImpl implements sorteoService{
    
    private final sorteoRepository sorteoRepository;

    public sorteoServiceImpl(sorteoRepository repository) {
        this.sorteoRepository = repository;
    }

    @Override
    public Iterable<sorteo> getAll() {
        return this.sorteoRepository.findAll();
    }

    @Override
    public void register(sorteoDao userDao) {
        
        sorteo sorteos = new sorteo();

        BeanUtils.copyProperties(userDao, user);

        this.UserRepository.save(user);
    }
    
}