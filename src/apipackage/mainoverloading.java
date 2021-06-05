package apipackage;

public class mainoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("In main method");
      main(12);
      main(1.2f);
	}
	public static void main(int a) {
		// TODO Auto-generated method stub
      System.out.println("In main method" + a);
	}
	public static void main(float f) {
		// TODO Auto-generated method stub
      System.out.println("In main method" + f);
	}
	

}
