package com.aug.test;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void input1ShouldReturn1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.getMessage());
    }
}
