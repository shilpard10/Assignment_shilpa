package apipackage;

import java.util.Scanner;

public class FernsAndPetals3 {

	static int choice;
	//static int i=1;
	static int roses=10;
	static int sunflowers=5;
	static int tulips=25; 
	static int scan;
	static int inputqty;
	static int mychoice;
	static int subchoice;
	static int quantity;
	public static void main(String[] args) {
		mainmenu();
	}
		private static void mainmenu() {
		System.out.println("1 : Show Inventory");
		System.out.println("2 : Purchase");
		System.out.println("3 : Exit");
        System.out.println("Enter your choice");
		Scanner scan=new Scanner(System.in);
		choice =scan.nextInt();
		if(choice>=0 && choice <=4)
		{
			switch(choice) {
			
			case 1 :  showInventory();
			          
			          break;
			          
			case 2 :  purchase();
	                  break;
	        		             
			case 3 :  //generateBill();
			          break;
			          
			case 4 :  System.exit(0);
		              
			default : common();	
		}
		
		}
		}
		
		private static int submenu(int subchoice) {
			System.out.println("1 : Roses");
			System.out.println("2 : Sunflower");
			System.out.println("3 : Tulips");
			System.out.println("4 : Goback to main menu");
		    System.out.println("Enter your choice");
		    Scanner scan1=new Scanner(System.in);
		    subchoice =scan1.nextInt();
		    return subchoice;
			}
		
	public static void showInventory()
	{
		System.out.println("Roses " +roses);
		System.out.println("Sunflower " +sunflowers);
		System.out.println("Tulips " +tulips);		
	}
	
	public static void purchase() {
		System.out.println("1 : Roses");
		System.out.println("2 : Sunflower");
		System.out.println("3 : Tulips");
		System.out.println("4 : Goback to main menu");
	    System.out.println("Select the flower you want to buy");
	    Scanner scan=new Scanner(System.in);
	    int submenu=scan.nextInt();        
		
		}
	    	
	    
		
		
		
		
		
		
	
	public static int exit()
	{
		System.out.println("Exit the application");
		return 0;
		
	}
	
	public static void common()
	{
		System.out.println("Happy shopping");
	}
}
