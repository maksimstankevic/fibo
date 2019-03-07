package com.restful.fibo;

public class BadSeedException extends RuntimeException {

    public BadSeedException(String s) {
        super(s);
    }
}
