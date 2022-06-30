package com.xqf.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.MINUTE, -5);
        System.out.println(beforeTime);
        System.out.println(beforeTime.getTime());
    }

}
