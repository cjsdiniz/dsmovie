package com.dinizc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dinizc.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email);
    
}
