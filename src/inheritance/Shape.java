package inheritance;

public abstract class Shape {
	abstract void draw();

}

class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing a Triangle");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
