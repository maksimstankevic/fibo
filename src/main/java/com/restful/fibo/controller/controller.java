package com.restful.fibo.controller;

import com.restful.fibo.model.FibonacciSeed;
import com.restful.fibo.service.FibonacciSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private FibonacciSequence instance;

    @PostMapping("/fibonaccisequence")
    public String generator (@RequestBody FibonacciSeed seed){
        return instance.generateSequence(seed);
    }
}
