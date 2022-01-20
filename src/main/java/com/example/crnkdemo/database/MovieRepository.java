package com.example.crnkdemo.database;

import com.example.crnkdemo.database.entity.Movie;

import org.springframework.stereotype.Component;

import io.crnk.data.jpa.JpaEntityRepositoryBase;

@Component
public class MovieRepository extends JpaEntityRepositoryBase<Movie, Long> {

    public MovieRepository() {
        super(Movie.class);
    }

    /* edit 2*/
}