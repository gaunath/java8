package com.gaurab.java.lamda.parallelStream;

import java.text.DecimalFormat;
import java.util.List;

import com.gaurab.java.dao.Database;
import com.gaurab.java.dto.Employee;

public class ParallelStreamDemo {
	
	public static void main(String[] args) {
		
		DecimalFormat decimalFormatter = new DecimalFormat("#.##");
		
		long start = 0;
		long end = 0;
		
		List<Employee> getData = Database.getThousandData();
		
		start = System.currentTimeMillis();
		double avg = getData.stream().map(x->x.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("avg salary using streams execution time"+decimalFormatter.format(avg)+" : "+(end - start));
		
		start = System.currentTimeMillis();
		double avgParallelStream = getData.parallelStream().map(x->x.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("avg salary using parallelStream execution time"+decimalFormatter.format(avgParallelStream)+" : "+(end - start));
	}

}
