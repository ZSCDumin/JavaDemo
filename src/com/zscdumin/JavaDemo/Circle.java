package com.zscdumin.JavaDemo;

public class Circle implements Shape {
	private static final double PI = 3.14;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	private double r;                  //���Բ�εİ뾶����

	public Circle() {
	}

	public Circle(double r) {           //����һ��Բ�Ĺ��췽����rΪ�β�
		this.r = r;
	}

	@Override
	public double getArea() {          //����Բ�����
		return PI * r * r;
	}

	@Override
	public double getPerimeter() {     //����Բ���ܳ�
		return PI * 2 * r;
	}

}
