package apipackage;

import java.util.Scanner;

public class FernsAndPetals2 {

	static int choice;
	static int i=1;
	static int roses=10;
	static int sunflowers=5;
	static int tulips=25; 
	static int scan;
	static int inputqty;
	static int mychoice;
	static int subchoice;
	static boolean flag=false;
	public static void main(String[] args) {
		mychoice=mainmenu(choice);
		while(!flag) {				
		switch(mychoice) {
		
		case 1 :  showInventory();
		          mychoice=mainmenu(choice);
		          break;
		          
		case 2 :  purchase();
                  break;
        		             
		case 3 :  int ext=exit();
		          break;
	              
		default : common();
	}
		if(mychoice==3)
		{
			flag=true;
		}
		
		}
		}

		private static int mainmenu(int choice) {
		System.out.println("1 : Show Inventory");
		System.out.println("2 : Purchase");
		System.out.println("3 : Exit");
        System.out.println("Enter your choice");
		Scanner scan=new Scanner(System.in);
		choice =scan.nextInt();
		return choice;
		}
		
	public static void showInventory()
	{
		System.out.println("Roses " +roses);
		System.out.println("Sunflower " +sunflowers);
		System.out.println("Tulips " +tulips);		
	}
	
	public static void purchase()
	{   
		for(int counter=1;counter<=4;counter++) 
		{
		System.out.println("1 : Roses");
		System.out.println("2 : Sunflower");
		System.out.println("3 : Tulips");
		System.out.println("4 : Goback to main menu");
        System.out.println("Enter your choice");
        Scanner scan1=new Scanner(System.in);
		subchoice =scan1.nextInt();
		
		if(subchoice==4)
		{
			mychoice=mainmenu(choice);
			break;
		}
		
		System.out.println("Enter the quantity");
		Scanner quantity=new Scanner(System.in);
		inputqty =quantity.nextInt();
		
		}
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
