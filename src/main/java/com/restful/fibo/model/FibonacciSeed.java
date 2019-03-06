package com.restful.fibo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class FibonacciSeed {
    @Getter @Setter
    private int seed;
}
