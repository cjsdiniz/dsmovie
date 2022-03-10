package com.dinizc.dsmovie.dto;

public class ScoreDTO {
    
    private Long movieId;
    private String email;
    private Long score;

    public ScoreDTO() {
    }
    
    public Long getMovieId() {
        return movieId;
    }
    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getScore() {
        return score;
    }
    public void setScore(Long score) {
        this.score = score;
    }

    
}
