package com.dinizc.dsmovie.controllers;

import com.dinizc.dsmovie.dto.MovieDTO;
import com.dinizc.dsmovie.dto.ScoreDTO;
import com.dinizc.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    
    @Autowired
    private ScoreService service;

    // @GetMapping
    // public Page<ScoreDTO> findAll(Pageable pageable) {
    //     return service.findAll(pageable); 
    // }
 
    // @GetMapping(value = "/{id}")
    // public ScoreDTO findById(@PathVariable Long id) {
    //     return service.findById(id); 
    // }

    //@PutMapping(value = "/{id}")

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO score) {
        MovieDTO dto = service.saveScore(score);
        return dto;
    }
}
