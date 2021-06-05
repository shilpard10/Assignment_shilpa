package apipackage;
//super->to refer to instance variable to immediate parent class
//super and this keyword can not be used in static context
//super->to refer to method of immediate parent class
//to invoke the constructor of immediate parent class

class Vehicle
{
	int speed=90;
}

public class Bike extends Vehicle {
	int speed =70;
	void show()
	{
		System.out.println("speed of bike is "+speed );
		System.out.println("speed of vehicle is " +super.speed);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike b=new Bike();
      b.show();
	}

}
