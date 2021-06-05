package apipackage;

class CurrentAccount extends Account
{
	float transactionfees;
	void inputcurrentDetails()
	{
		System.out.println("Enter transaction fees");
		transactionfees=scan.nextFloat();
	}
	
	void showcurrentDetails()
	{
		System.out.println("Transaction fees is " +transactionfees);
	}
}

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount();
		CurrentAccount ca=new CurrentAccount();
		
		System.out.println("Enter details of saving account");
		sa.input();
		sa.inputsavingDetails();
		System.out.println("Enter the details of current account");
		ca.input();
		ca.inputcurrentDetails();
		
		System.out.println("show details of saving account");
		sa.show();
		sa.showDetails();
		
		System.out.println("Show details of current account");
		ca.show();
		ca.showcurrentDetails();
	}

}
