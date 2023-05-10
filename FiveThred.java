package com.sheet3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FiveThred {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Future<?> helloWorldFuture = executor.submit(new HelloWorld());
		helloWorldFuture.get();
		
		Future<Integer> helloWorldFutureCallable = executor.submit(new HelloWorldCallable(3,4));
		Integer result = helloWorldFutureCallable.get();
		System.out.println(result);
		
		Future<Integer> helloWorldFutureCallable1 = executor.submit(new HelloWorldCallable(5,6));
		
		Future<Integer> helloWorldFutureCallable2 = executor.submit(new HelloWorldCallable(7,8));
		
		Future<Integer> helloWorldFutureCallable3 = executor.submit(new HelloWorldCallable(8,9));
		
		
		Integer result1 = helloWorldFutureCallable1.get();
		System.out.println(result1);
		
		Integer result2 = helloWorldFutureCallable2.get();
		System.out.println(result2);
		
		Integer result3 = helloWorldFutureCallable3.get();
		System.out.println(result3);
	}
	

	
	

	
}
