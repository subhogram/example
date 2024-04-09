package com.example.subho.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.subho.example.model.Film;
import com.example.subho.example.repository.FilmRepository;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> list(){
        return filmRepository.findAll();
    }

}
