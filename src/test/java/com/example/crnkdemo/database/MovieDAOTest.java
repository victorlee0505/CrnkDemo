package com.example.crnkdemo.database;

import static com.example.crnkdemo.util.TestUtil.printClassEnd;
import static com.example.crnkdemo.util.TestUtil.printClassStart;
import static com.example.crnkdemo.util.TestUtil.printEnd;
import static com.example.crnkdemo.util.TestUtil.printStart;
import static org.junit.Assert.assertTrue;

import java.util.List;

import com.example.crnkdemo.database.entity.Movie;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MovieDAOTest {

    private static final Logger LOG = LoggerFactory.getLogger(MovieDAOTest.class);

    @Autowired
    private MovieDAO movieDao;

    @BeforeClass
    public static void classStart() {
        printClassStart();
    }

    /** Print end of test class. */
    @AfterClass
    public static void classEnd() {
        printClassEnd();
    }

    @Test
    public void testFindAll(){
        printStart();

        LOG.info("Movie.findAll: {}", movieDao.findAll());

        printEnd();
    }
    
    @Test
    public void testSavAndFlush(){
        printStart();

        Movie movie = new Movie();
        movie.setTitle("save1");
        movie.setYear("2020");
        movie.setRating(6);

        movieDao.saveAndFlush(movie);

        List<Movie> movieList = movieDao.findAll();
        assertTrue(movieList.size() == 4);

        for (Movie mov : movieList) {
            LOG.info("[{}]", mov.toString());
        }

        printEnd();
    }
}
