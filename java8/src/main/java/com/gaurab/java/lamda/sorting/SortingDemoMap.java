package com.gaurab.java.lamda.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.gaurab.java.dao.Database;
import com.gaurab.java.dto.Employee;

import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.core.env.CommandLinePropertySource;

public class SortingDemoMap {

	public static void main(String[] args) {

		/* tree map for sorting data by default on key */
		Map<String, Integer> treeMapData = new TreeMap<>();
		treeMapData.put("gaurabe", 30);
		treeMapData.put("insiya", 18);
		treeMapData.put("binoy", 30);
		treeMapData.put("olga", 32);
		treeMapData.put("amit", 29);
		treeMapData.put("deva", 31);
		treeMapData.put("priya", 34);
		treeMapData.put("shagun", 28);

		// treeMapData.entrySet().stream().forEach(x->System.out.println("tree map"+x));

		/* hash map for sorting data */
		Map<String, Integer> mapdata = new HashMap<>();
		mapdata.put("gaurabe", 30);
		mapdata.put("insiya", 18);
		mapdata.put("binoy", 30);
		mapdata.put("olga", 32);
		mapdata.put("amit", 29);
		mapdata.put("deva", 31);
		mapdata.put("priya", 34);
		mapdata.put("shagun", 28);

		List<Entry<String, Integer>> mapentries = new ArrayList<>(mapdata.entrySet());

		/*
		 * Traditional appoarch for sorting a hashmap
		 * 
		 * 
		 * Collections.sort(mapentries, new Comparator<Entry<String, Integer>>() {
		 * 
		 * @Override public int compare(Entry<String, Integer> o1, Entry<String,
		 * Integer> o2) {
		 * 
		 * return o1.getKey().compareTo(o2.getKey()); } });
		 */

		// HashMap with lamda expression
		/*
		 * Collections.sort(mapentries,(x,y)->x.getKey().compareToIgnoreCase(y.getKey())
		 * );
		 * 
		 * mapentries.forEach(x->System.out.println(x.getKey() + ":"+x.getValue()));
		 */

		/*
		 * System.out.
		 * println("sort hashmap with respect of Key using lamda expression and comparator"
		 * ); mapdata.entrySet().stream().sorted(Map.Entry.comparingByKey()) .forEach(x
		 * -> System.out.println(x.getKey() + ":" + x.getValue()));
		 * 
		 * System.out.
		 * println("sort hashmap with respect of values using lamda expression and comparotor"
		 * ); mapdata.entrySet().stream().sorted(Map.Entry.comparingByValue())
		 * .forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));
		 */

		Map<Employee, Integer> empMapData = Database.getEmployeeMap();


		empMapData.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));
		
		System.out.println("Sorted map with collectors.ToMap++++++++++++++++++++++++++++++++");
		
		Map<Employee, Integer> sortedMap = empMapData.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		
		sortedMap.forEach((x,y)->System.out.println(x+":"+y));

	}

}
