package com.aug.test;

public class FizzBuzz {

    public String getMessage(String input) {
        if (Integer.parseInt(input) % 15 == 0) {
            return "fizzbuzz";
        }else if (Integer.parseInt(input) % 3 == 0) {
            return "fizz";
        } else if (Integer.parseInt(input) % 5 == 0) {
            return "buzz";
        } else {
            return input;
        }
    }
}