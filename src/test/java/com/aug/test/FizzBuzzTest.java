package com.aug.test;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

//เป็นคลาสที่เขียนขึ้นมาเพื่อเทสโปรแกรม โดยมองเป็น unit หรือ unit test
//junit test
	
    @Test
    public void input1ShouldReturn1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.getMessage());
    }
    
    @Test
    public void input3ShouldReturnfizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.getMessage());
    }
    
    @Test
    public void input5ShouldReturnbuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.getMessage());
    }
    
    
    @Test
    public void input15ShouldReturnfizzbuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizzbuzz", fizzBuzz.getMessage());
    }
    
    @Test
    public void input2ShouldReturn2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("2", fizzBuzz.getMessage());
    }
}
