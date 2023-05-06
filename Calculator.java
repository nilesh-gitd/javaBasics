package com.p;

public class Calculator {
	
	int addition(int a, int b) {
		
		int c = a+b;
		return c;
	}
	
	int subtract(int a, int b) {
		
		return a-b;
	}
	
	int multiplication(int a, int b ) {
		
		return a*b;
	}
	
	double division(int a, int b) {
		double c = a/b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
			System.out.print(obj.addition(3,2));
			System.out.print("\n"+obj.subtract(3,2));
			System.out.print("\n"+obj.multiplication(3,2));
			System.out.print("\n"+obj.division(3,2));
	}

}
