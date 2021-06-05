package apipackage;
//super->to refer to 
//super
//super -> to refer pa

class Vehicle2
{
	void show()
	{
		System.out.println("Vehicle running");
	}
}

public class Bike2 extends Vehicle2 {
	
	void show()
	{
		System.out.println("bike running");
		
	}
	void display()
	{
		show();
		super.show();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike2 b=new Bike2();
      b.display();
	}

}
