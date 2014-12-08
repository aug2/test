package com.aug.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void newGameShouldReturnLoveAll() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
    }
}
