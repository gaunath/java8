package com.gaurab.java.Programs;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String reverseddata = getReverse("Gaurabe");
		System.out.println("reverse String "+reverseddata.toLowerCase());
	}
	
	public static String getReverse(String originaldata) {
		return new StringBuilder(originaldata).reverse().toString();
	}

}
