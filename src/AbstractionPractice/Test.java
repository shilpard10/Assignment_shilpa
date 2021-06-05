package AbstractionPractice;
//abstract method - method without body

//whenever the class has atleast one abstract method then class should also be declared as abstract
//abstract classes can not be instantiated but they can be extended
//abstract class may or may not have abstract methods
//abstract method of superclass should be overriden by subclass
//or subclass should be declared as abstract

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}
}

abstract class Traingle extends Shape {

}
class UpperTriangle extends Traingle{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing uppertriangle");
	}
	
}

class Rectangle extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle s=new Circle();
     Rectangle r=new Rectangle();
     UpperTriangle u=new UpperTriangle();
     s.draw();
     r.draw();
     u.draw();
     
	}

}
