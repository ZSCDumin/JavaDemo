package com.zscdumin.JavaDemo;

public class Rectangle implements Shape {
	private double a, b;              //��ӳ����εĳ����ε�����

	public Rectangle(double a, double b) {  //��ӳ����εĹ��췽����a��bΪ�βΣ�
		this.a = a;
		this.b = b;
	}

	public Rectangle() {
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getArea() {
		return a * b;
	}

	@Override
	public double getPerimeter() {
		return 2 * (a + b);
	}

}
