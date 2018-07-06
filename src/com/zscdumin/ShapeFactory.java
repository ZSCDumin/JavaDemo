package com.zscdumin;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("com.zscdumin.Circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("com.zscdumin.Rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("com.zscdumin.Square")) {
			return new Square();
		}
		return null;
	}

}
