package com.example.crnkdemo;

import static com.example.crnkdemo.util.TestUtil.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class JunitTestTemplate {
    
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
    public void sample(){
        printStart();

        printEnd();
    }
}
