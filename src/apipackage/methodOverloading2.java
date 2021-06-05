package apipackage;

public class methodOverloading2 {

	void add(int a, int b)
	{
		System.out.println("Sum is is " +(a+b));
	}
	void add(float a, float b)
	{
		System.out.println("Sum is is " +(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading2 obj=new methodOverloading2();
		obj.add(1,2);
		obj.add(1.0f, 2.0f);

	}

}
