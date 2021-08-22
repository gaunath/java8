package com.gaurab.java.pre.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class SupDemo implements Supplier<String>{

	@Override
	public String get() {
		return "Inside sup traditional approach";
	}
	
}


public class SupplierDemo {
	public static void main(String[] args) {
		SupDemo d1 = new SupDemo();
		d1.get();
		
		List<Integer> data = Arrays.asList(1, 2, 4, 6, 7, 8, 9);
		
		Supplier<String> supllier = ()->  "this is a lamda appoach";
		
		supllier.get();
		System.out.println(supllier.get());
		
		
		data.stream().findAny().orElse(0);
		
	System.out.println("list with supplier functional interface"+data.stream().findAny().orElse(0));
	}
}
