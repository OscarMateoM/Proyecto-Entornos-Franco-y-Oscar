package com.franco.oscar.proyecto.parkingmanager.sorteo;

public interface sorteoService {
    
    public Iterable<sorteo> getAll();

    public void register(sorteoDao sorteoDao);
}
