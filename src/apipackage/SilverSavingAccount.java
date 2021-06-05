package apipackage;

public class SilverSavingAccount extends SavingAccount {
	
	String offerid;
	void inputsilversaving()
	{
		System.out.println("Enter offer id");
		offerid=scan.next();
	}
	
	void showsilversaving()
	{
		System.out.println("Offer id is " + offerid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SilverSavingAccount a=new SilverSavingAccount();
		a.input();
		a.inputsavingDetails();
		a.inputsilversaving();
		a.show();
		a.showDetails();
		a.showsilversaving();
		
		
	}

}
