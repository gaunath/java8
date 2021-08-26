package com.gaurab.java.lamda.optional;

import java.util.Arrays;
import java.util.Optional;

import com.gaurab.java.dto.Customer;

public class OptionalDemo {
	
	
	public static void main(String[] args) {
		Customer customer = new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));
		
		/* there are 3 ways we can create optional onjct in 3 ways */
		
		/* 1. empty */
		
		Optional<Customer> gender = Optional.of(customer);
		System.out.println("optional demo"+gender.get());
		
	}
}
