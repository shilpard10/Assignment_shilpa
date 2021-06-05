package AbstractionPractice;

public abstract class A {

	static int a;

	A() {
		a = 20;
		System.out.println("A constructor called");
	}

	void m1() {
		System.out.println("m1 from A called");
	}

	static void m2() {
		System.out.println("m2 from A called");
	}

	abstract void m3();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
		System.out.println(a);
	}

}
