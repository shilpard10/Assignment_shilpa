package apipackage;
//super->to refer to 
//super
//super -> to refer pa

class Vehicle3
{
	 Vehicle3(int i)
	{
		System.out.println("Vehicle running");
	}
}

public class Bike3 extends Vehicle3 {
	
	 Bike3()
	{
		super(12);
		System.out.println("bike running");
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike3 b3=new Bike3();
      
     
	}

}
