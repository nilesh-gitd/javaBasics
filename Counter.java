package com.sheet3;

public class Counter {
	
private int counter;
    
    public synchronized void increaseCounter() {
        try {
            Thread.sleep(300); // Added sleep to mimic time consuming operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    
    
        this.counter++;
        System.out.println("Counter value is " + this.counter);
    }
}
