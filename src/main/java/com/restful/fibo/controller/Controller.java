package com.restful.fibo.controller;

import com.restful.fibo.service.FibonacciSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class Controller {

    @GetMapping(value = "/fibonaccisequence", produces = MediaType.APPLICATION_JSON_VALUE)
    public Resource<String> root () {return new Resource<>("Provide Fibonacci seed in URI, example link:", linkTo(methodOn(Controller.class).generator(7)).withRel("fibonaccisequence/7"));}

    @GetMapping(value = "/fibonaccisequence/{seed}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Resource<FibonacciSequence> generator(@PathVariable int seed) {
        FibonacciSequence instance = new FibonacciSequence();
        instance.setSeed(seed);
        FibonacciSequence out = instance.generateSequence();
        return new Resource<>(out, linkTo(methodOn(Controller.class).generator(seed)).withSelfRel(), linkTo(methodOn(Controller.class).root()).withRel("fibonaccisequence"));
    }
}
