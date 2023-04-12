package com.franco.oscar.proyecto.parkingmanager.sorteo;
/**
 * @author Franco y Oscar
 * @version 0.1
 * Service de sorteo para formulario
 */

public interface sorteoService {
    
    public Iterable<sorteo> getAll();

    public void register(sorteoDao sorteosDao);
}
