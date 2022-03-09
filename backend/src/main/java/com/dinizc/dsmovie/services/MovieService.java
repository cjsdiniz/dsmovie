package com.dinizc.dsmovie.services;

import com.dinizc.dsmovie.dto.MovieDTO;
import com.dinizc.dsmovie.entities.Movie;
import com.dinizc.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }
}
