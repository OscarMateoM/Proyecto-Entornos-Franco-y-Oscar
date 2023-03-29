package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository 
public interface sorteoRepository extends CrudRepository<sorteo, Long> {

}
