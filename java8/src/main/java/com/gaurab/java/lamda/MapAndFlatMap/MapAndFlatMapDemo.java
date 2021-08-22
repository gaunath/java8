package com.gaurab.java.lamda.MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

import com.gaurab.java.dao.Database;
import com.gaurab.java.dto.Customer;

public class MapAndFlatMapDemo {
	
	public static void main(String[] args) {
		
		List<Customer> customers = Database.getCustomer();
		
		System.out.println("Example Map : OneToOne Mapping , map() is used to map the data");
		List<String> email = customers.stream().map(x->x.getEmail()).collect(Collectors.toList());
		email.forEach(x->System.out.println(x));
		
		System.out.println("Get a list of list of phone number : List<List<String>> phoneNumberList");
		List<List<String>> phoneNumberList = customers.stream().map(x->x.getPhonenumbers()).collect(Collectors.toList());
		phoneNumberList.forEach(x->System.out.println(x));
		
		System.out.println("Example flatMap : OneToMany Mapping , flatMap() is used to map the data AND Flattering it");
		List<String> phonenumbers = customers.stream().flatMap(x-> x.getPhonenumbers().stream()).collect(Collectors.toList());
		phonenumbers.forEach(x->System.out.println(x));
	}

}
