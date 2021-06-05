package Inheritance;

import java.util.Scanner;

public class FertsAndPetals {

	public static void main(String[] args) {
		int choice;
		while((choice= menu())!=2)
		{
			switch(choice) {
			
			case 1 : purchaseRoses();
			        break;
			
			}
			
			
		}
			

	}

	private static void purchaseRoses() {
		System.out.println("Enter qunatity");
		
	}

	private static int menu() {
		System.out.println("1.Rose");
		System.out.println("2.Exit");
		System.out.println("Enter your choise");
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
		return choice;
	}

}
