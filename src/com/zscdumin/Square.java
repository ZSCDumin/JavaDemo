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

	private double a;                 //��������εı߳�����

	public Square(double a) {          //����һ�������εĹ��췽����aΪ�β�
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
