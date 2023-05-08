package com.p;

import java.io.File;
import java.io.IOException;

public class Permission {
	
	public static void main(String[] args) {
		try {
   		 
		      File file = new File("C:\\git-demo\\practice\\createdFile.txt");
		      
		      if(file.exists()){
		      System.out.println("Is Execute allow : " + file.canExecute());
			  System.out.println("Is Write allow : " + file.canWrite());
			  System.out.println("Is Read allow : " + file.canRead());
		      }
		         
		      file.setExecutable(true);
		      file.setReadable(true);
		      file.setWritable(true);
		      
		      System.out.println("Is Execute allow : " + file.canExecute());
		      System.out.println("Is Write allow : " + file.canWrite());
		      System.out.println("Is Read allow : " + file.canRead());
		      
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
		      
	    	} catch (IOException e) {
		      e.printStackTrace();
		    }
	    }
		
	}


