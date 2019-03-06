package com.restful.fibo.service;

import com.restful.fibo.model.FibonacciSeed;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;

@Component
public class FibonacciSequence {
    public String generateSequence (FibonacciSeed seed) {

        if (seed.getSeed() >= 0) {
            BigInteger[] seq = new BigInteger[seed.getSeed() + 1];
            seq[0] = new BigInteger("0");
            for (int i = 1; i < seq.length; i++) {
                seq[i] = i == 1 ? seq[i - 1].add(new BigInteger("1")) : seq[i - 1].add(seq[i - 2]);
            }
            return Arrays.toString(seq);
        }
        throw new IllegalArgumentException("Please supply a non-negative seed.");

    }
}
