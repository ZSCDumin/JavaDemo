package com.zscdumin;

public class ShapeFactory {
	public Shape getShape(String shapeType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("com.zscdumin.Circle")) {
			Class<?> circle = Class.forName("com.zscdumin.Circle");
			return (Circle) circle.newInstance();
		} else if (shapeType.equalsIgnoreCase("com.zscdumin.Rectangle")) {
			Class<?> rectangle = Class.forName("com.zscdumin.Rectangle");
			return (Rectangle) rectangle.newInstance();
		} else if (shapeType.equalsIgnoreCase("com.zscdumin.Square")) {
			Class<?> square = Class.forName("com.zscdumin.Square");
			return (Square) square.newInstance();
		}
		return null;
	}

}
