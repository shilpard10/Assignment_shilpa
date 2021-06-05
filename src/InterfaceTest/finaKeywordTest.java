package InterfaceTest;
//final->data member->constant->mandatory to initialize->at the time of declaration/constructor
//final->method->cannot be overriden
//final->class->cannot be extended

final class Superclass
{
	
}

public class finaKeywordTest {
   final int data;
   static int s;
   finaKeywordTest()
   {
	   data=10;
   }
   public void show()
   {
	   final int data=90;
	   System.out.println(data);
	   
   }
   void m()
   {
	   
	   
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finaKeywordTest ex=new finaKeywordTest();
		ex.show();
		System.out.println(s);
	}

}
