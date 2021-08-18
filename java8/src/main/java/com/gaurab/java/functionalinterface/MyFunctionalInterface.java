package com.gaurab.java.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface {

	void sum();

	default void default1() {
		System.out.println("default method 1");
	}

	default void default2() {
		System.out.println("default method 2");
	}

	static void staticm1() {
		System.out.println("static method m1");
	}
}
