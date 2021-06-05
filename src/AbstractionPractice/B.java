package AbstractionPractice;

public class B extends A {

	B()
	{
		System.out.println("B constructor called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b=new B();
      b.m1();
      b.m3();
      m2();
      

	}
	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 called from B");
	}

}
