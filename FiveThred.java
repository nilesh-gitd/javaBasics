package com.sheet3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FiveThred {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		executor.execute(helloWorld());
	}

	private static Runnable helloWorld() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		return null;
	}

	
}
