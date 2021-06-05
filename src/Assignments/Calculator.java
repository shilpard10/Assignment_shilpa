package Assignments;

import java.util.Scanner;

public class Calculator {
	static int result;

	public static int addition(int x, int y) {
		result = x + y;
		System.out.println("Addition is " + result);
		return result;
	}

	public static int subtraction(int x, int y) {
		result = x - y;
		System.out.println("Subtraction is " + result);
		return result;
	}

	public static int multiplication(int x, int y) {
		result = x * y;
		System.out.println("Multiplication is " + result);
		return result;
	}

	public static int division(int x, int y) {
		result = x / y;
		System.out.println("Division is " + result);
		return result;
	}

	public static int modulous(int x, int y) {
		result = x % y;
		System.out.println("Modulous is " + result);
		return result;
	}

}
