package com.sheet3;

import java.util.concurrent.Callable;

public class HelloWorldCallable implements Callable {

	private Integer a;
	private Integer b;
	HelloWorldCallable(Integer x, Integer y){
		a = x;
		b = y;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return a+b ;
	}
	
}
