package com.example.subho.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "film")
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer filmId;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    public Film(String description, Integer releaseYear){}

    public Film(){}

    @Override
    public String toString() {
        return "Film [filmId=" + filmId + ", description=" + description + ", releaseYear=" + releaseYear + "]";
    }

    public Integer getFilmId() {
        return filmId;
    }
    
    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }  

}
