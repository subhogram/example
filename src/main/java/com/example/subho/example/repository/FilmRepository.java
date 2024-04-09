package com.example.subho.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.subho.example.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{

}
