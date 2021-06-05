package Assignments;

import java.util.Scanner;

public class CalciImplementation {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.addition(10, 20);
		c.subtraction(10, 20);
		c.multiplication(10, 20);
		c.division(10, 20);
		c.modulous(10, 20);

		ScientificCalculator sc = new ScientificCalculator();

		sc.addition(45, 5);
		sc.subtraction(10, 7);
		sc.multiplication(15, 20);
		sc.division(100, 20);
		sc.modulous(40, 20);
		sc.sin(45.0);
		sc.cos(45.0);

	}

}
