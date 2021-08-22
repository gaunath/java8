package com.gaurab.java.lamda.ForeachandFilter;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	
	public static void main(String[] args) {
		List<String> data = Arrays.asList("Ram", "Rahim", "Gaurabe", "shagun", "avnash", "binoy", "datteam", "deva");
		
		//List<String> filterdata = data.stream().filter(x->x.startsWith("r")).collect(Collectors.toList());

		data.stream().map(String :: toUpperCase).filter(x->x.startsWith("R")).forEach(x->System.out.println("PRINT :"+x));
		
		
	}

}
