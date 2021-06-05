package Assignments;

import java.util.Scanner;

public class EmployeeDirectory {

	private static void menu() {
		System.out.println("Option 1 : Add Employee");
		System.out.println("Option 2 : Search Employee");
		System.out.println("Option 3 : Delete Employee");
		System.out.println("Option 4 : ShowAll Employee");
		System.out.println("Option 5 : Exit");
		System.out.println("Enter your choice");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		System.out.println(choice);
	}

}
