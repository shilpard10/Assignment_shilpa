package stringHandling;

public class ImmutableStringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shilpa";
		s.concat("Kulkarni");
		System.out.println(s);//shilpa
		s=s.concat("Kulkarni");
		System.out.println(s);//shilpakulkarni

	}

}
