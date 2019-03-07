package com.restful.fibo.service;

import com.restful.fibo.BadSeedException;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;

@Data
@Component
public class FibonacciSequence {

    private int seed;
    private String fibonacciSequence;

    public FibonacciSequence(){}
    public FibonacciSequence(int seed){
        this.seed = seed;
    }

    public FibonacciSequence generateSequence() {


        if (seed > 0) {
            BigInteger[] seq = new BigInteger[seed];
            seq[0] = new BigInteger("0");
            for (int i = 1; i < seq.length; i++) {
                seq[i] = i == 1 ? seq[i - 1].add(new BigInteger("1")) : seq[i - 1].add(seq[i - 2]);
            }
            fibonacciSequence = Arrays.toString(seq);
            return this;
        }
        throw new BadSeedException("Please supply a positive seed (fibonaccisequence/n>0).");

    }

}
