package apipackage;

import java.util.Scanner;

public class UserCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number ");
		int number1=scan.nextInt();
		
		System.out.println("Enter second number ");
		int number2=scan.nextInt();
		
		result = number1+number2;
		System.out.println("The addition of two numbers is "+result);
		
		result = number1-number2;
		System.out.println("The subtraction of two numbers is "+result);
		
		result = number1*number2;
		System.out.println("The multiplication of two numbers is "+result);
		
		result = number1/number2;
		System.out.println("The division of two numbers is "+result);
		
		result = number1%number2;
		System.out.println("The modulous of two numbers is "+result);
		
		}

}
