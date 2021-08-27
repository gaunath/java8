package com.gaurab.java.Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxElementFromList {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 1, 5, 6, 7, 7, 6, 5, 9, 1, 6, 8);
		
		Optional<Integer>  maxNumber = Optional.ofNullable(data.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get());
		System.out.println(maxNumber.get());
	}
}
