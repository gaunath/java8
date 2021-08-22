package com.gaurab.java.pre.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Demo1 implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("traditional approach"+t);
	}

}

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		d1.accept(11);
		

		List<Integer> data = Arrays.asList(1, 2, 4, 6, 7, 8, 9);

		Consumer<Integer> cons = t -> System.out.println("print" + t);
		cons.accept(10);

		data.stream().forEach(cons);
		
		data.stream().forEach(t->System.out.println("printing"+t));
	}
}