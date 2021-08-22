package com.gaurab.java.pre.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class preDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else
			return false;
	}

}

public class PredicateDemo {
	public static void main(String[] args) {
		preDemo d1 = new preDemo();
		d1.test(1);
		System.out.println("traditional approach" + d1.test(1));

		List<Integer> data = Arrays.asList(1, 2, 4, 6, 7, 8, 9);

		Predicate<Integer> pre = t -> t % 2 == 0;
		pre.test(10);

		System.out.println("lamda approach" + pre.test(10));

		data.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print" + t));

	}

}
