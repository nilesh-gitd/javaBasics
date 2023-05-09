package com.sheet3;

public class ThreadHello extends Thread {
	
	public void run() {
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		ThreadHello obj = new ThreadHello();
		obj.start();
	}
}
