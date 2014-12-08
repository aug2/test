package com.aug.test;

public class NumberInWords {
    public String convert(int input) {
    	String words[] = {"Zero","One","Two","Three","Four"};
    	
    	if(input > 4) {
    		switch (input) {
			case 5: return "Four";
			default: return "Five";
			}
    	}else return words[input];
    		
    	
    }
}
