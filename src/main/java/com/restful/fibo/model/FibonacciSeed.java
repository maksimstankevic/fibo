package com.restful.fibo.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class FibonacciSeed {
    @Getter
    private int seed;
}
