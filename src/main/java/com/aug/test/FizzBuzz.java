package com.aug.test;

public class FizzBuzz {

	public String getMessage(String input) {
		if (Integer.parseInt(input) % 15 == 0) {
			return "FizzBuzz";
		} else if (Integer.parseInt(input) % 3 == 0) {
			return "Fizz";
		} else if (Integer.parseInt(input) % 5 == 0) {
			return "Buzz";
		} else if (Integer.parseInt(input) == 7) {
			return "Boo";
		} else {
			return input;
		}
	}
}