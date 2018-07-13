package com.zscdumin.JavaDemo;

public class ShapeFactory {
	public Shape getShape(String shapeType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("com.zscdumin.JavaDemo.Circle")) {
			Class<?> circle = Class.forName("com.zscdumin.JavaDemo.Circle");
			return (Circle) circle.newInstance();
		} else if (shapeType.equalsIgnoreCase("com.zscdumin.JavaDemo.Rectangle")) {
			Class<?> rectangle = Class.forName("com.zscdumin.JavaDemo.Rectangle");
			return (Rectangle) rectangle.newInstance();
		} else if (shapeType.equalsIgnoreCase("com.zscdumin.JavaDemo.Square")) {
			Class<?> square = Class.forName("com.zscdumin.JavaDemo.Square");
			return (Square) square.newInstance();
		}
		return null;
	}

}
