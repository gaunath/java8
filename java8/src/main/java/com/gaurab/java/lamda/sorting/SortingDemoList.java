package com.gaurab.java.lamda.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.gaurab.java.dao.Database;
import com.gaurab.java.dto.Employee;

class salaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}

}

public class SortingDemoList {

	public static void main(String[] args) {
		List<Integer> intdata = Arrays.asList(1, 44, 5, 9, 12, 67, 8, 98);
		Collections.sort(intdata);
		System.out.println("traditional sorting asc " + intdata);

		Collections.reverse(intdata);
		System.out.println("traditional sorting desc" + intdata);

		intdata.stream().sorted().forEach(x -> System.out.println("sorting data using lamda asc " + x));

		List<Employee> empData = Database.getEmployee();

		Collections.sort(empData, new salaryComparator());

		System.out.println("custom obj traditional sorting asc" + empData);

		System.out.println("custom obj  sorting asc by lamda/ method reference"
				+ empData.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()));
		
		System.out.println("custom obj  sorting desc by lamda/ method reference"
				+ empData.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()));
		
		System.out.println("multiple sorting custom obj  sorting asc by lamda/ method reference"
				+ empData.stream().sorted(Comparator.comparing(Employee:: getName).thenComparing(Employee::getDept)).collect(Collectors.toList()));
		
	
	}

}
