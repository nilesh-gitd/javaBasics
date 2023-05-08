package com.p;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter writer = new FileWriter("createdFile.txt");
		writer.write("this line is written by a java program");
		writer.close();
		System.out.println("successfully written to file");
	}
		catch(IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
}
