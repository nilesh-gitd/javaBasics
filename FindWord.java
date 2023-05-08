package com.p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter word to be found");
		String word = s1.nextLine();
		boolean flag = false;
		int count = 0;
		
		Scanner s2 = new Scanner(new FileInputStream("C:\\git-demo\\practice\\createdFile.txt"));
	      while(s2.hasNextLine()) {
	         String line = s2.nextLine();
	         System.out.println(line);
	         if(line.indexOf(word)!=-1) {
	            flag = true;
	            count = count+1;
	         }
	      }
	      if(flag) {
	         System.out.println("File contains the specified word");
	         System.out.println("Number of occurrences is: "+count);
	      } else {
	         System.out.println("File does not contain the specified word");
	      }
	}

}
