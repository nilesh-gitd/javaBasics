package com.p;

import java.io.File;

public class DeleteDir {
	
	public static void delete(File file){
		
		for(File subfile :file.listFiles()) {
			
			if (subfile.isDirectory()) {
                delete(subfile);
            }
			subfile.delete();
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:\\git-demo\\practice\\New folder";
		File file = new File(filepath);
		
		delete(file);
		file.delete();
	}

}
