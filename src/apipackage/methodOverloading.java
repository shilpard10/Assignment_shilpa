package apipackage;

public class methodOverloading {

	void area(float r)
	{
		System.out.println("Area of circle is " +(3.14*r*r));
	}
	void area(float l,float b)
	{
		System.out.println("Area of rectangle is " +(l*b));
	}
	void area(float pt,float b, float ht)
	{
		System.out.println("Area of triangle is " +(pt*b*ht));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading obj=new methodOverloading();
		obj.area(1.5f);
		obj.area(2.5f, 3.5f);
		obj.area(0.5f, 1.5f, 2.5f);

	}

}
