package com.dinizc.dsmovie.repositories;

import com.dinizc.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
    
}
