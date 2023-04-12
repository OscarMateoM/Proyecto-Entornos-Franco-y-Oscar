package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Implementacion del service para formularios de sorteo
 */

@Service
public class sorteoServiceImpl implements sorteoService{
    
    private final sorteoRepository sorteoRepository;

    public sorteoServiceImpl(sorteoRepository repository) {
        this.sorteoRepository = repository;
    }

    
    /** 
     * Busca en sorteoRepository y devuelve informacion
     * @return Iterable<sorteo>
     */
    @Override
    public Iterable<sorteo> getAll() {
        return this.sorteoRepository.findAll();
    }

    
    /** 
     * Guarda los sorteos que se van creando
     * @param sorteosDao
     */
    @Override
    public void register(sorteoDao sorteosDao) {
        
        sorteo sorteos = new sorteo();

        BeanUtils.copyProperties(sorteosDao, sorteos);

        this.sorteoRepository.save(sorteos);
    }
    
}