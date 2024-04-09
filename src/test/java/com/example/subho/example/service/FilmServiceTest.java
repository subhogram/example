package com.example.subho.example.service;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.subho.example.model.Film;
import java.io.IOException;
import java.io.FileWriter;

@SpringBootTest
public class FilmServiceTest {

    @Autowired
    FilmService filmService;

    public void writeToFile(String content,String filePath){        
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    void testList() {
        List<Film> films = filmService.list();        
        String directoryPath = "D:/Projects/Repository";
        films.forEach(
            (film)->
            {
                String filePath = directoryPath + "/file" + (film.getFilmId() + 1) + ".txt";
                String content = film.getDescription();
                writeToFile(content, filePath);
            }
        );
        Assertions.assertThat(films.size()).isGreaterThan(0);
    }
}
