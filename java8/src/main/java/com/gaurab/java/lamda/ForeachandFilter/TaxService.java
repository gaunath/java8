package com.gaurab.java.lamda.ForeachandFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.gaurab.java.dao.Database;
import com.gaurab.java.dto.Employee;
import com.gaurab.java.dto.TaxDetails;

public class TaxService {

	public List<Employee> evaluateTax(String taxBracket) {
		List<Employee> empdata = Database.getEmployee();

		if (taxBracket.equalsIgnoreCase("high income")) {
			return empdata.stream().filter(x -> x.getSalary() > 1500000).collect(Collectors.toList());
		} else if (taxBracket.equalsIgnoreCase("mid income")) {
			return empdata.stream().filter(x -> x.getSalary() > 1000000 && x.getSalary() < 1500000)
					.collect(Collectors.toList());
		} else {
			return empdata.stream().filter(x -> x.getSalary() < 1000000).collect(Collectors.toList());
		}

	}

	public List<Employee> evaluateTaxTernaryOperator(String taxBracket) {
		List<Employee> empdata = Database.getEmployee();

		return (taxBracket.equalsIgnoreCase("high income"))
				? empdata.stream().filter(x -> x.getSalary() > 1500000).collect(Collectors.toList())
				: (taxBracket.equalsIgnoreCase("mid income"))
						? empdata.stream().filter(x -> x.getSalary() > 1000000 && x.getSalary() < 1500000)
								.collect(Collectors.toList())
						: empdata.stream().filter(x -> x.getSalary() < 1000000).collect(Collectors.toList());
	}
	
	Function<Employee, TaxDetails> taxBracket = x->{
		if (x.getSalary() >= 1500000) {
			return new TaxDetails(x.getId(), x.getName(), x.getSalary(), "High income", 30.0);
		} else if (x.getSalary() >= 100000) {
			return new TaxDetails(x.getId(), x.getName(), x.getSalary(), "low income", 10.0);
		} else {
			return new TaxDetails(x.getId(), x.getName(), x.getSalary(), "mid income", 20.0);

		}
	};

	public List<TaxDetails> getTaxDetails() {
		List<Employee> empdata = Database.getEmployee();
		return empdata.stream().map(x -> taxBracket.apply(x)).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		TaxService tax = new TaxService();
		System.out.println("emp less 10 lac list " + tax.evaluateTax(""));
		System.out.println("emp more 10 lac list " + tax.evaluateTax("mid income"));
		System.out.println("emp high salaray list " + tax.evaluateTax("high income"));

		System.out.println(
				"++++++++===============================================================================================");

		System.out.println("emp less 10 lac list " + tax.evaluateTaxTernaryOperator(""));
		System.out.println("emp more 10 lac list " + tax.evaluateTaxTernaryOperator("mid income"));
		System.out.println("emp high salaray list " + tax.evaluateTaxTernaryOperator("high income"));

		System.out.println(
				"++++++++===============================================================================================");

		System.out.println("tax details " + tax.getTaxDetails());

	}

}
