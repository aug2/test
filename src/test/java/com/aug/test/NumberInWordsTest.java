package com.aug.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberInWordsTest {

    @Test
    public void input0ShouldReturnZero() {
        NumberInWords numberInWords = new NumberInWords();
        assertEquals("Zero", numberInWords.convert(0));
    }

}
