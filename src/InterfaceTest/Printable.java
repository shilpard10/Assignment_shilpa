package InterfaceTest;

public interface Printable {
	int data = 90;// public static final

	void print();// public abstract
//concrete method -> default/static method

	default void m1()// may or may not be overridden
	{
		System.out.println("m1 from printable");
	}

	static void m2()// cannot be overridden
	{
		System.out.println("m2 from printable");
	}
}
