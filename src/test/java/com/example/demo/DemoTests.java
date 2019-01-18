package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =  DemoApplication.class)
public class DemoTests {

    @Test
    public void contextLoads4() {
        System.out.println("TEST4");
    }

    @Test
    public void contextLoads5() {
        System.out.println("TEST5");
    }

    @Test
    public void contextLoads6() {
        System.out.println("TEST6");
    }

}