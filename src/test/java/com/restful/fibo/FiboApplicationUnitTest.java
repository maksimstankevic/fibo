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
public class FiboApplicationUnitTest {

	@Autowired
	private FibonacciSequence instance;

	@Test
	public void testIt () {
		FibonacciSeed seed = new FibonacciSeed();
		seed.setSeed(0);

		String expectedResult = "[0]";

		if (!instance.generateSequence(seed).equals(expectedResult)) throw new RuntimeException("It's not working");
	}

}




