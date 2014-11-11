package com.aug.test;

public class FizzBuzz {

    public String getMessage(String datainput) {
        if (Integer.parseInt(datainput) % 3 == 0 && (Integer.parseInt(datainput) % 5 != 0)) {
            return "fizz";
        } else if (Integer.parseInt(datainput) % 5 == 0 && (Integer.parseInt(datainput) % 3 != 0)) {
            return "buzz";
        } else if ((Integer.parseInt(datainput) % 3 == 0) && (Integer.parseInt(datainput) % 5 == 0)) {
            return "fizzbuzz";
        } else {
            return datainput;
        }
    }
}