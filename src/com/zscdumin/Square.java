package com.zscdumin;

public class Square implements Shape {
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public Square() {
	}

	private double a;                 //添加正方形的边长属性

	public Square(double a) {          //创建一个正方形的构造方法，a为形参
		this.a = a;
	}

	@Override
	public double getArea() {
		return a * a;
	}

	@Override
	public double getPerimeter() {
		return 4 * a;
	}

}
