package com.barrons.chapter1;

public class ChapterOne {

	public ChapterOne() {
		// TODO Auto-generated constructor stub
	}
	
	public static void problemTwo() {
		System.out.println("\\* This is not\n a comment *\\");		
	}

	public static void problemThree() {
		int n = 0;
		int x = 1;
		if(n != 0 && x/n > 100 )
			System.out.println("Statement 1");
		else
			System.out.println("Statement 2");
	}
	
	public static void problemFour() {
		double answer = (double) (13 / 5);
		System.out.println("13 / 5 = " + answer);
	}
	
	public static void problemFive() {
		int result = 13 - 3 * 6 / 4 % 3;
		System.out.println("Result: " + result);
	}
}
