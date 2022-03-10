package com.dinizc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dinizc.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
    
}
