package com.dinizc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dinizc.dsmovie.entities.Score;
import com.dinizc.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
    
    
}
