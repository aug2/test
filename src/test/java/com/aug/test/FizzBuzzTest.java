package com.aug.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void input1ShouldReturn1(){
        assertEquals("1", fizzBuzz.getMessage("1"));
    }

    @Test
    public void input3ShouldReturnFizz(){
        assertEquals("Fizz", fizzBuzz.getMessage("3"));
    }

    @Test
    public void input5ShouldReturnbuzz(){
        assertEquals("Buzz", fizzBuzz.getMessage("5"));
    }


    @Test
    public void input15ShouldReturnfizzbuzz(){
        assertEquals("FizzBuzz", fizzBuzz.getMessage("15"));
    }

    @Test
    public void input2ShouldReturn2(){
        assertEquals("2", fizzBuzz.getMessage("2"));
    }

    @Test
    public void input7ShouldReturnBoo(){
        assertEquals("Boo", fizzBuzz.getMessage("7"));
    }
}
