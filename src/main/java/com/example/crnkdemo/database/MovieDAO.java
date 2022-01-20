package com.example.crnkdemo.database;

import java.util.List;

import com.example.crnkdemo.database.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieDAO extends JpaRepository<Movie, Long> {

    @Query("SELECT m FROM Movie m")
    List<Movie> findAll();

    /*edit1*/
}
