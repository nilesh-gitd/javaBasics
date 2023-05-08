package com.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj = new File("createdFile.txt");
			Scanner read = new Scanner(obj);
			
			while(read.hasNextLine()) {
				String data = read.nextLine();
				System.out.println(data);
			}
			read.close();
		}catch(FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
