package com.gaurab.java.cloning;

import lombok.Data;

@Data
public class ShallowCopyEmployee {

	private int id;
	 
	private String name;
 
	private ShallowCopyDept dept;
	
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
