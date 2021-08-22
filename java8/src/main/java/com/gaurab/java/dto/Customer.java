package com.gaurab.java.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> phonenumbers;
}
