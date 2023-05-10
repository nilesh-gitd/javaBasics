package com.sheet3;

import javax.naming.Context;

public class ThreadLocalWithUserContext implements Runnable {
	 
    private static ThreadLocal<Context> userContext = new ThreadLocal<>();
    private Integer userId;
    private UserRepository userRepository = new UserRepository();

    @Override
    public void run() {
        String userName = userRepository.getUserNameForUserId(userId);
        userContext.set(new Context(userName));
        System.out.println("thread context for given userId: " 
          + userId + " is: " + userContext.get());
    }
    
public static void main(String[] args) {
	
	ThreadLocalWithUserContext firstUser = new ThreadLocalWithUserContext(1);
	ThreadLocalWithUserContext secondUser = new ThreadLocalWithUserContext(2);
	new Thread(firstUser).start();
	new Thread(secondUser).start();
}
}