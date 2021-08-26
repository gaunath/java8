package com.gaurab.java.Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateEmemntsFromList {

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 1, 5, 6, 7, 7, 6, 5, 9, 1, 6, 8);

		Set<Integer> tempList = findDuplicates(data);

		System.out.println("traditional appraoch" + tempList);

		List<Integer> dps = data.stream().distinct().filter(entry -> Collections.frequency(data, entry) > 1)
				.collect(Collectors.toList());

		System.out.println(" duplicate elements " + dps);
	}

	public static Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {

		final Set<Integer> setToReturn = new HashSet<>();
		final Set<Integer> set1 = new HashSet<>();

		for (Integer yourInt : listContainingDuplicates) {
			if (!set1.add(yourInt)) {
				setToReturn.add(yourInt);
			}
		}
		return setToReturn;
	}
}
