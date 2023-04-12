package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Franco y Oscar
 * @version 0.1
 * Respository de sorteo
 */
@Repository 
public interface sorteoRepository extends CrudRepository<sorteo, Long> {

}
