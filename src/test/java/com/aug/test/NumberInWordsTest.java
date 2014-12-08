package com.aug.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberInWordsTest {

    @Test
    public void input0ShouldReturnZero() {
        NumberInWords numberInWords = new NumberInWords();
        assertEquals("Zero", numberInWords.convert(0));
    }

    @Test
    public void input1ShouldReturnOne() {
        NumberInWords numberInWords = new NumberInWords();
        assertEquals("One", numberInWords.convert(1));
    }

    @Test
    public void input2ShouldReturnTwo() {
        NumberInWords numberInWords = new NumberInWords();
        assertEquals("Two", numberInWords.convert(2));
    }

    @Test
    public void input3ShouldReturnThree() {
        NumberInWords numberInWords = new NumberInWords();
        assertEquals("Three", numberInWords.convert(3));
    }

    @Test
    public void input4ShouldReturnFour() {
        NumberInWords numberInWords = new NumberInWords();
        assertEquals("Four", numberInWords.convert(4));
    }
}
