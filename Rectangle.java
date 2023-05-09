package com.sheet3;

public class Rectangle implements Shape {
	
	int l = 3;
	int b = 4;
	double ar;
	
	@Override
	public double area() {
		
		ar = l*b;
		return ar;
	}
	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle();
		System.out.println(obj.area());
		
		}
}
