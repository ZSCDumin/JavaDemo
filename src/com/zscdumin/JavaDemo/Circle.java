package com.zscdumin.JavaDemo;

public class Circle implements Shape {
	private static final double PI = 3.14;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	private double r;                  //添加圆形的半径属性

	public Circle() {
	}

	public Circle(double r) {           //创建一个圆的构造方法，r为形参
		this.r = r;
	}

	@Override
	public double getArea() {          //计算圆的面积
		return PI * r * r;
	}

	@Override
	public double getPerimeter() {     //计算圆的周长
		return PI * 2 * r;
	}

}
