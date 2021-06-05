package InterfaceTest;

public class A implements Printable, Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.print();
		System.out.println(Printable.data);
        a.show();
        a.m1();
        Printable.m2();
	}
	/*
	 * @Override public void m2() {
	 * 
	 * }
	 */

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print from A");
		System.out.println(Showable.data);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show from A");
	}

}
