package com.domain;

import com.domain.tiny;

public class Main {

    public static String helloString(){
        return "hello, this is Java";
    }

    public static void main(String[] args) {
        System.out.println("(binomial 5 3): " + tiny.binomial(5, 3));
        System.out.println("(binomial 10042, 111): " + tiny.binomial(10042, 111));
    }
}