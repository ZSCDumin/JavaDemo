
public class FactoryPatternDemo {
	public static void main(String[] args) {

		double area = 0.0;
		double perimer = 0.0;

		ShapeFactory shapeFactory = new ShapeFactory();
		Circle circle = (Circle) shapeFactory.getShape("Circle");
		circle.setR(2.0);
		area = circle.getArea();
		perimer = circle.getPerimeter();
		System.out.println(area + "---" + perimer);


		Square square = (Square) shapeFactory.getShape("Square");
		square.setA(2.0);
		area = square.getArea();
		perimer = square.getPerimeter();
		System.out.println(area + "---" + perimer);


		Rectangle rectangle = (Rectangle) shapeFactory.getShape("Rectangle");
		rectangle.setA(2.0);
		rectangle.setB(2.0);
		area = rectangle.getArea();
		perimer = rectangle.getPerimeter();
		System.out.println(area + "---" + perimer);
	}

}
