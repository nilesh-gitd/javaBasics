package com.p;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		
		System.out.println("enter the name of user");
		
		String name = ip.nextLine();
		
		System.out.println("the name of user is "+ name);
	}

}
