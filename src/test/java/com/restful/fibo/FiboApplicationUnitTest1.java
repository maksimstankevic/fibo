package com.restful.fibo;

import com.restful.fibo.service.FibonacciSequence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FiboApplicationUnitTest1 {


	@Test
	public void testIt() {
        FibonacciSequence instance = new FibonacciSequence();
		instance.setSeed(5);


		String expectedResult = "[0, 1, 1, 2, 3]";


		if (!instance.generateSequence().getFibonacciSequence().equals(expectedResult)) throw new RuntimeException("It's not working: " + " expected result: " + expectedResult + " , actual result: " + instance.generateSequence().getFibonacciSequence());


	}
}




