package com.gaurab.java.pre.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("Ram","Rahim","Gaurabe","shagun","avnash","binoy","datteam","deva");
		
		Function<String, Integer> func = r->r.length();
		
		func.apply("Gaurabe");
		System.out.println(func.apply("Gaurabe"));
		
		
		
		List<Integer> dataLenght = data.stream().map(r->r.length()).collect(Collectors.toList());
		
		Map<String, Integer> funcMAP =  data.stream().collect(Collectors.toMap(x-> x,x->x.length()));
		
		System.out.println(dataLenght);
		System.out.println(funcMAP);
 
	}
}
