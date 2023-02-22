package com.franco.oscar.proyecto.parkingmanager.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository 
public interface userRepository extends CrudRepository<User, Long> {

}

