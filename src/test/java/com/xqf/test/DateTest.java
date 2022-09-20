package com.xqf.test;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;



/**
 * @author xuqifeng
 * @create 2022/8/23 13:56
 **/
public class DateTest {

    @Test
    public void test(){
        LocalDate localDate = new LocalDate().minusMonths(12);

        System.out.println(localDate.plusYears(1));

    }
}
