package Inheritance;

public class Rose extends Flower {
	
	Double prize;
	int quantity;

public void purchase(int qtytopurchase)
{
	if(this.quantity<=qtytopurchase)
	{
		
		this.quantity=this.quantity-qtytopurchase;
	}
}


}
