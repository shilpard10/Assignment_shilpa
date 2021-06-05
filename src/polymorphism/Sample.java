package polymorphism;

public class Sample {
	Shape create()//return object of circle/rectangle/triangle
	{
		int choice;
		choice =3;
		System.out.println("Enter 1 for circle");
		System.out.println("Enter 2 for rectangle");
		System.out.println("Enter 3 for triangle");
		
		if(choice==1)
		{
			Circle c=new Circle();
			return c;
		}
		if(choice==2)
		{
			return new Rectangle();//anonymous object
			
		}
		if(choice==3)
		{
			return new Triangle();
			
		}
		else
			return new Shape();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		Shape obj=s.create();
		obj.draw();

	}

}
