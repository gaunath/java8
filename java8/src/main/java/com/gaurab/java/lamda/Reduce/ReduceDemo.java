package com.gaurab.java.lamda.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import com.gaurab.java.dao.Database;
import com.gaurab.java.dto.Employee;

public class ReduceDemo {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(16, 3, 7, 78, 99, 123, 56, 6, 4);

		/* traditional Appraoch for Sum of all elements in List */
		int sum = 0;
		for (int no : numbers) {
			sum = sum + no;
		}
		System.out.println("traditional sum-->" + sum);

		/* Sum of all elements in List with lamda Expression / without reduce */
		int sumWithLamda = numbers.stream().mapToInt(x -> x).sum();
		System.out.println("sumWithLamda -->" + sumWithLamda);

		/* Sum of all elements in List with reduce */
		Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sumWithReduce -->" + reduceSum);

		Optional<Integer> sumOptionalResult = numbers.stream().reduce(Integer::sum);
		System.out.println("sumOptionalResult -->" + sumOptionalResult.get());
		
		Integer mulResult = numbers.stream().reduce(1,(x,y)->x*y);
		System.out.println("mulResult -->" + mulResult);
		
		Integer subResult = numbers.stream().reduce(1,(x,y)->x-y);
		System.out.println("mulResult -->" + subResult);
		
		/* Max of all elements in List with reduce */
		Optional<Integer> maxOptionalResult = numbers.stream().reduce(Integer:: max);
		System.out.println("sumOptionalResult -->" + maxOptionalResult.get());
		
		/* Min of all elements in List with reduce */
		Optional<Integer> minOptionalResult = numbers.stream().reduce(Integer:: min);
		System.out.println("sumOptionalResult -->" + minOptionalResult.get());
		
		
		/* Demo of Reduce with Lamda expression and List of String */
		  
		List<String> words = Arrays.asList("corejava", "spring", "hibernate","java8", "springBoot");
		
		Optional<String> longestWords = Optional.ofNullable(words.stream().reduce((a,b)-> a.length() > b.length() ? a:b).get());
		System.out.println("longestWords -->" + longestWords.get());
		
		List<Employee> empDta = Database.getEmployee();
		
		OptionalDouble avgSalary = empDta.stream().filter(x->x.getDept().equalsIgnoreCase("IT")).map(x->x.getSalary()).mapToDouble(i->i).average();
		System.out.println("avg salary" +avgSalary.getAsDouble());
		
		double sumSalary = empDta.stream().filter(x->x.getDept().equalsIgnoreCase("Tax")).map(x->x.getSalary()).mapToDouble(i->i).sum();
		System.out.println("sum salary" +sumSalary);
	}
}
