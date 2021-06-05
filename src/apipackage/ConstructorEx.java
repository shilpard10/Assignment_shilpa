package apipackage;

public class ConstructorEx {
	int id;//instance variables
	String name;//instance variables
	ConstructorEx()
	{
		System.out.println("Constructoer called");
		id=1;
		name="Shilpa";
	}
	
	ConstructorEx(int i,String n)
	{
		System.out.println("Constructoer called");
		id=i;
		name=n;
	}

	void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx s1=new ConstructorEx();
		ConstructorEx s2=new ConstructorEx(2,"Shamika");
		s2.show();
		
	}

}
