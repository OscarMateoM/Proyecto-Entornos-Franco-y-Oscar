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
    public void register(sorteoDao sorteosDao) {
        
        sorteo sorteos = new sorteo();

        BeanUtils.copyProperties(sorteosDao, sorteos);

        this.sorteoRepository.save(sorteos);
    }
    
}