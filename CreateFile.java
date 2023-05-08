package com.p;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj = new File("createdFile.txt");
			if(obj.createNewFile()) {
				System.out.println("file created: "+ obj.getName() );
			}
			else{
				System.out.println("file alredy exists");
			}
		}
		catch(IOException e){
			System.out.println("an error has occured");
			e.printStackTrace();
		}
		
	}

}
