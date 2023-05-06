package com.p;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> users = new HashMap<Integer, String>();
		
		Scanner ip = new Scanner(System.in);
		System.out.println("enter phone no.");
		int no = ip.nextInt();
		
		users.put(no, "ram");
		
		System.out.println(users.get(no));
	}

}
