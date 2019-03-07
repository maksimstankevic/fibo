package com.restful.fibo;

import com.restful.fibo.service.FibonacciSequence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FiboApplicationUnitTest2 {

   
    @Test
    public void testIt () {

        FibonacciSequence instance = new FibonacciSequence();
        instance.setSeed(-1);

        String expectedResult = "[1]";

        try {
            if (!instance.generateSequence().getFibonacciSequence().equals(expectedResult)) throw new RuntimeException("It's not working: " + " expected result: " + expectedResult + " , actual result: " + instance.generateSequence().getFibonacciSequence());
        } catch (BadSeedException e) {
            assert e.getMessage().equals("Please supply a positive seed (fibonaccisequence/n>0)."): "Test failed. Exception text: \"" + e.getMessage() + "\" instead of expected \"Please supply a positive seed.\"";
        }
    }

}