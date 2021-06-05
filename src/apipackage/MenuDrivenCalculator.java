package apipackage;

import java.util.Scanner;

public class MenuDrivenCalculator {

	static int result;
		
	public static void main(String[] args) {
		System.out.println("1 : Addition");
		System.out.println("2 : Substraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		System.out.println("5 : Modulous");
		System.out.println("Enter your choice");
		Scanner scan=new Scanner(System.in);
		int choice =scan.nextInt();
		
		System.out.println("Enter first number ");
		int no1=scan.nextInt();
		
		System.out.println("Enter second number ");
		int no2=scan.nextInt();
		
		switch(choice) {
		
		case 1 :  addition(no1,no2);
		          break;
		          
		case 2 :  subtraction(no1,no2);
                  break;
        
		case 3 :  multiplication(no1,no2);
                  break;
        
		case 4 :  division(no1,no2);
                  break;
        
		case 5 :  modulous(no1,no2);
                  break;
		                  
		default : common();
				
	}
		}
	
	
	public static int addition(int x, int y)
	{
		result = x+y;
		System.out.println("Addition is " +result);
		return result;
	}
	
	public static int subtraction(int x, int y)
	{
		result = x-y;
		System.out.println("Subtraction is " +result);
		return result;
	}
	
	public static int multiplication(int x, int y)
	{
		result = x*y;
		System.out.println("Multiplication is " +result);
		return result;
	}
	
	public static int division(int x, int y)
	{
		result = x/y;
		System.out.println("Division is " +result);
		return result;
	}
	
	public static int modulous(int x, int y)
	{
		result = x%y;
		System.out.println("Modulous is " +result);
		return result;
	}
	
	public static void common()
	{
		System.out.println("Happy calculating");
	}
}
