package com.restful.fibo;

import com.restful.fibo.service.FibonacciSequence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.restful.fibo.model.FibonacciSeed;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FiboApplicationUnitTest2 {

    @Autowired
    private FibonacciSequence instance;

    @Test
    public void testIt () {
        FibonacciSeed seed = new FibonacciSeed();
        seed.setSeed(-1);

        String expectedResult = "[1]";

        try {
            if (!instance.generateSequence(seed).equals(expectedResult)) throw new RuntimeException("It's not working: " + " expected result: " + expectedResult + " , actual result: " + instance.generateSequence(seed));
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Please supply a positive seed."): "Test failed. Exception text: \"" + e.getMessage() + "\" instead of expected \"Please supply a positive seed.\"";
        }
    }

}