package apipackage;

public class thisRealTimeEx {
	 
	 int x,y;
	 float length,breadth;
	 
	 thisRealTimeEx()
	 {
	  this(0,0,4,5);
	  
	 }
	 
	 thisRealTimeEx(float l,float b)
	 {
	  this(0,0,l,b);
	 }
	 
	 thisRealTimeEx(int a,int b, float l, float br)
	 {
	  x=a;
	  y=b;
	  length=l;
	  breadth=br;
	  
	 }
	 public static void main(String[] args) {
		 thisRealTimeEx r1=new thisRealTimeEx();
		 thisRealTimeEx r2=new thisRealTimeEx(2,3);
		 thisRealTimeEx r3=new thisRealTimeEx(2,3,4,5);

	 }

	}
