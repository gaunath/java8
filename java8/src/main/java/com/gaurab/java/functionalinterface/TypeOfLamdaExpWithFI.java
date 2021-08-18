package com.gaurab.java.functionalinterface;

@FunctionalInterface
interface calculate {
	// void sum(int a, int b);

	float calCelcius(float degree);
	
}

@FunctionalInterface
interface SubsTract {
	float getsubstract(float a, float b);
	
}

public class TypeOfLamdaExpWithFI {

	public static void main(String[] args) {

		/*
		 * calculate cal = (a, b) -> { System.out.println(a + b); }; cal.sum(20, 10);
		 */
		
		calculate cal =	degree->degree =((degree-32)*5)/9;
		
		System.out.println("celcius from franite is"+cal.calCelcius(97));
		
		SubsTract sub = (float a, float b)->{
			if (a < b) {
				throw new RuntimeException("first is small");
			}else {
				return a-b;
			}	
		};
		System.out.println("value of substract is "+sub.getsubstract(11, 2));
		
		
	}

}
