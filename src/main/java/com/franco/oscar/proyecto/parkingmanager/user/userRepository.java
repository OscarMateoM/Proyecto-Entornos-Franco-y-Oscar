package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Franco y Oscar
 * @version 0.1
 * Repository de usuarios
 */

@Repository 
public interface userRepository extends CrudRepository<User, Long> {

}

