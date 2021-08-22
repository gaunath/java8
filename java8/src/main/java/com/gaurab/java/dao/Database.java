package com.gaurab.java.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.gaurab.java.dto.Customer;
import com.gaurab.java.dto.Employee;

//DOA
public class Database {

	public static List<Employee> getEmployee(){
		List<Employee> empdata = new ArrayList<>();
		empdata.add(new Employee(1, "Gaurabe", "IT", 100000));
		empdata.add(new Employee(2, "Insiya", "Tax", 1100000));
		empdata.add(new Employee(3, "Binoy", "Audit",1200000));
		empdata.add(new Employee(4, "Datta", "IT", 1107000));
		empdata.add(new Employee(5, "Deva", "IT", 2100000));
		empdata.add(new Employee(6, "Olga", "Audit", 2090000));
		empdata.add(new Employee(7, "Maleka", "Tax", 1170000));
		empdata.add(new Employee(8, "Amit", "Tax", 900000));
		empdata.add(new Employee(9, "Gaurav", "IT", 2100000));
		empdata.add(new Employee(10, "praveen", "Tax", 2190000));
		return empdata;
		
	}
	
	public static Map<Employee, Integer> getEmployeeMap(){
		Map<Employee, Integer> empdata = new HashMap<Employee, Integer>();
		empdata.put(new Employee(1, "Gaurabe", "IT", 100000), 30);
		empdata.put(new Employee(2, "Insiya", "Tax", 1100000), 29);
		empdata.put(new Employee(3, "Binoy", "Audit",1200000), 31);
		empdata.put(new Employee(4, "Datta", "IT", 1107000), 30);
		empdata.put(new Employee(5, "Deva", "IT", 2100000), 31);
		empdata.put(new Employee(6, "Olga", "Audit", 2090000),32);
		empdata.put(new Employee(7, "Maleka", "Tax", 1170000),33);
		empdata.put(new Employee(8, "Amit", "Tax", 900000),29);
		empdata.put(new Employee(9, "Gaurav", "IT", 2100000),31);
		empdata.put(new Employee(10, "praveen", "Tax", 2190000),33);
		return empdata;		
	}
	
	public static List<Customer> getCustomer(){
		List<Customer> customers= new ArrayList<>();
		customers.add(new Customer(1, "Gaurabe","gaunath@gmail.com", Arrays.asList("989055","989056")));
		customers.add(new Customer(2, "Binoy","binoy@gmail.com", Arrays.asList("932263","932261")));
		customers.add(new Customer(3, "olga","olga@gmail.com", Arrays.asList("980968","980967")));
		customers.add(new Customer(4, "amit","amit@gmail.com", Arrays.asList("932203","932204")));
		customers.add(new Customer(5, "insiya","insiya@gmail.com", Arrays.asList("912203","912204")));
		customers.add(new Customer(6, "deva","deva@gmail.com", Arrays.asList("937203","937204")));
		customers.add(new Customer(7, "datta","datta@gmail.com", Arrays.asList("932293","932284")));
		
		
		return customers;	
	}
}
