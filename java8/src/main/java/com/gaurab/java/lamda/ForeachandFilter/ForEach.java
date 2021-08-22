package com.gaurab.java.lamda.ForeachandFilter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {

		List<String> data = Arrays.asList("Ram", "Rahim", "Gaurabe", "shagun", "avnash", "binoy", "datteam", "deva");

		for (String name : data) {
			// System.out.println("print traditional for loop"+name);
		}

		/*
		 * data.stream().forEach(x -> System.out.println("lamda for loop " + x));
		 * data.stream().forEachOrdered(x ->
		 * System.out.println("lamda forEachOrdered loop " + x));
		 */

		Map<String, Integer> phoneNumber = new HashMap<>();
		phoneNumber.put("Ram", 99890190);
		phoneNumber.put("Rahim", 99892890);
		phoneNumber.put("Gaurabe", 99390890);
		phoneNumber.put("shagun", 99840890);
		phoneNumber.put("avnash", 99850890);
		phoneNumber.put("binoy", 99896890);
		phoneNumber.put("datteam", 99790890);
		phoneNumber.put("deva", 99890810);

		// phoneNumber.forEach((x, y) -> System.out.println("Key " + x + " : " + "value
		// " + y));

		phoneNumber.entrySet().stream().filter(x -> x.getKey().toUpperCase().startsWith("R"))
				.forEach(x -> System.out.println("map value with stream , filter , foreach " + x.getKey() + " : " + x.getValue()));

		phoneNumber.entrySet().stream().filter(x -> x.getKey().toUpperCase().startsWith("R")).map(x->x.getKey().concat(x.getValue().toString()))
				.forEach(x -> System.out.println("map value with stream, filter, map, foreach "+x));

	}

}
