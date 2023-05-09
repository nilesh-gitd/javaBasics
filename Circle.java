package com.sheet3;

public class Circle implements Shape{
	
	int r = 5;
	double pi = 3.14;
	double ar = 0;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		ar = pi*r*r;
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		System.out.println(obj.area());
	}
}
