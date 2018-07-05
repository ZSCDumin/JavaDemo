import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {

		double area = 0.0;
		double perimer = 0.0;

		Scanner sc = new Scanner(System.in);
		ShapeFactory shapeFactory = new ShapeFactory();
		Circle circle = (Circle) shapeFactory.getShape("Circle");
		circle.setR(sc.nextDouble());
		area = circle.getArea();
		perimer = circle.getPerimeter();
		System.out.println(area + "---" + perimer);

		Square square = (Square) shapeFactory.getShape("Square");
		square.setA(sc.nextDouble());
		area = square.getArea();
		perimer = square.getPerimeter();
		System.out.println(area + "---" + perimer);

		Rectangle rectangle = (Rectangle) shapeFactory.getShape("Rectangle");
		rectangle.setA(sc.nextDouble());
		rectangle.setB(sc.nextDouble());
		area = rectangle.getArea();
		perimer = rectangle.getPerimeter();
		System.out.println(area + "---" + perimer);
	}

}
