package com.dinizc.dsmovie.services;

import com.dinizc.dsmovie.dto.ScoreDTO;
import com.dinizc.dsmovie.entities.Score;
import com.dinizc.dsmovie.repositories.MovieRepository;
import com.dinizc.dsmovie.repositories.ScoreRepository;
import com.dinizc.dsmovie.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {
    
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional(readOnly = true)
    public Page<ScoreDTO> findAll(Pageable pageable) {
        Page<Score> result = scoreRepository.findAll(pageable);
        Page<ScoreDTO> page = result.map(x -> new ScoreDTO(x));
        return page;
    }
    
    @Transactional(readOnly = true)
    public ScoreDTO findById(Long id) {
        Score result = scoreRepository.findById(id).get();
        ScoreDTO score =  new ScoreDTO(result);
        return score;
    }
    
    @Transactional
    public void saveScore(ScoreDTO score){

    }
}
