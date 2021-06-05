package polymorphism;
//mothod overriding and run time polymorphism

class Shape {

	void draw() {
		System.out.println("Drawing no shape");//method overriding
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle");//method overriding
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");//method overriding
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Shape();
		s.draw();
		s=new Circle();//upcasting
		s.draw();
		s=new Rectangle();
		s.draw();
		s=new Triangle();
		s.draw();

	}

}
