package apipackage;

import java.util.Scanner;

class Account
{
String accountid;
double balance;
Scanner scan=new Scanner(System.in);

void input()
{
	System.out.println("Enter account id and balance");
	accountid=scan.next();
	balance=scan.nextDouble();
}

void show()
{
	System.out.println("Account id is " + accountid);
	System.out.println("Balance is "+ balance);
}

}

public class SavingAccount extends Account {
	float rateofInterest;
	void inputsavingDetails()
	{
		System.out.println("Enter rate of interest");
		scan.nextFloat();
		
	}

	void showDetails()
	{
	System.out.println("ROI is " + rateofInterest);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount();
		sa.input();
		sa.inputsavingDetails();
		sa.show();
		sa.showDetails();
	}

}
