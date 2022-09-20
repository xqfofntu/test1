package com.xqf.test;

import com.google.common.collect.*;
import com.google.common.primitives.Ints;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

//@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.MINUTE, -5);
        System.out.println(beforeTime);
        System.out.println(beforeTime.getTime());
    }

    @Test
    void GuavaTest() {
        List countUp = Ints.asList(1, 2, 3, 4, 5);
        List countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}
        List<List> parts = Lists.partition(countUp, 2);//{{1,2}, {3,4}, {5}}
        System.out.println( countDown);
        System.out.println(parts);

        Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
        Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
        Sets.SetView<String> intersection = Sets.intersection(primes,wordsWithPrimeLength);//取交集
        System.out.println(intersection);

        Multiset<String> multiset1 = HashMultiset.create();
        multiset1.add("a", 2);
        Multiset<String> multiset2 = HashMultiset.create();
        multiset2.add("a", 5);
        System.out.println(multiset1 + "=========" + multiset2);
        System.out.println(multiset1.containsAll(multiset2)); //返回true；因为包含了所有不重复元素
        System.out.println(Multisets.containsOccurrences(multiset1, multiset2));//这个还要比较count(o)数量
    }

}
