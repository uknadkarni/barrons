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
		if (n != 0 && x / n > 100)
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

	public static void problemSix() {
		int result = (2 + 3) * 12 / ((7 - 4) + 8);
		System.out.println("Result: " + result);
	}

	public static void problemSeven() {
		double x = 3.0;
		if (3.0 == x * (3.0 / x)) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}

	}
	
	public static void problemNine() {
		int num = 22;
		if(num > 0)
			if(num % 5 == 0)
				System.out.println(num);
			else
				System.out.println(num + " is negative");
	}
	
	public static void problemTen() {
		int x = 30, y = 40;
		if(x >= 0) {
			if(x <= 100) {
				y = x * 3;
				if (y < 50)
					x /= 10;
			}
			else
				y = x * 2;
		}
		else
			y = -x;
		System.out.println("x: " + x + ", y: " + y);
	}
}
