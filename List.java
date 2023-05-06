package com.p;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> users = new ArrayList<String>();
		users.add("ram");
		users.add("shaym");
		users.add("sam");
		users.add("bam");
		
		for(int i =0; i<users.size(); i++ ) {
			System.out.println(users.get(i));
		}
		
	}

}
