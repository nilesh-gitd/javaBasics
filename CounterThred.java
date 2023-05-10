package com.sheet3;

public class CounterThred implements Runnable {

	 private Counter counter;
	    
	    public void CounterThread(Counter counter) {
	        this.counter = counter;
	    }

	    public void run() { 
	    	for (int i=0; i< 5; i++) {
	            counter.increaseCounter();
	    	}

	    }
	    
	    public static void main(String[] args) {
	        Counter counter = new Counter();
	        CounterThred counterThread = new CounterThred(counter);
	        Thread thread1 = new Thread(counterThread); 
	        Thread thread2 = new Thread(counterThread); 
	        Thread thread3 = new Thread(counterThread); 
	        thread1.start();
	        thread2.start();
	        thread3.start();
	    }
}
