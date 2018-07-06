package com.zscdumin;

import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

		double area = 0.0;
		double perimer = 0.0;

		Scanner sc = new Scanner(System.in);
		ShapeFactory shapeFactory = new ShapeFactory();
		Circle circle = (Circle) shapeFactory.getShape("com.zscdumin.Circle");
		circle.setR(sc.nextDouble());
		area = circle.getArea();
		perimer = circle.getPerimeter();
		System.out.println(area + "---" + perimer);

		Square square = (Square) shapeFactory.getShape("com.zscdumin.Square");
		square.setA(sc.nextDouble());
		area = square.getArea();
		perimer = square.getPerimeter();
		System.out.println(area + "---" + perimer);

		Rectangle rectangle = (Rectangle) shapeFactory.getShape("com.zscdumin.Rectangle");
		rectangle.setA(sc.nextDouble());
		rectangle.setB(sc.nextDouble());
		area = rectangle.getArea();
		perimer = rectangle.getPerimeter();
		System.out.println(area + "---" + perimer);


		/**
		 * 反射
		 */
		try {
			Class<?> circle1 = Class.forName("com.zscdumin.Circle");
			Circle circle3 = (Circle) circle1.newInstance();
			circle3.setR(2);
			System.out.println(circle3.getArea());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

}
