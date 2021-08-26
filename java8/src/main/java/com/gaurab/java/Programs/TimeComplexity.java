package com.gaurab.java.Programs;

public class TimeComplexity {
	public static void main(String[] args) {

		/* 1. Constant Time Algorithms – O(1) */
		int n = 1000;
		System.out.println("Hey - your input is: " + n);

		/* 2. Logarithmic Time Algorithms – O(log n) */

		for (int i = 1; i < n; i = i * 2) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}

		/* 3. Linear Time Algorithms – O(n) */
		for (int i = 0; i < n; i++) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}

		/* 4. N Log N Time Algorithms – O(n log n) */
		for (int i = 1; i <= n; i++) {	
			for (int j = 1; j < n; j = j * 2) {
				System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
			}
		}

	}
}
