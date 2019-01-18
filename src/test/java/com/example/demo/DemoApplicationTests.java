package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("TEST");
    }

    @Test
    public void contextLoads2() {
        System.out.println("TEST2");
    }

    @Test
    public void contextLoads3() {
        System.out.println("TEST3");
    }

}

