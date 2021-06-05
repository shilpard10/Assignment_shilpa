package Assignments;

public class ScientificCalculator extends Calculator {
	static double result;

	public static double sin(double x) {
		result = Math.sin(x);
		System.out.println("Sin is " + result);
		return result;
	}

	public static double cos(double x) {
		result = Math.cos(x);
		System.out.println("Cos is " + result);
		return result;
	}
}
