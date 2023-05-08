package com.p;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadZip {

	public void printFileContent(String filePath)
    {
        FileInputStream fs = null;
        ZipInputStream Zs = null;
        ZipEntry ze = null;
        
        try {
            System.out.println("Files in the zip are as follows: ");
 
            fs = new FileInputStream(filePath);
            Zs = new ZipInputStream(new BufferedInputStream(fs));
 
            while ((ze = Zs.getNextEntry()) != null) {
                System.out.println(ze.getName());
            }
             Zs.close();
        }
 
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        catch (IOException ie) {
 
            ie.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
    	ReadZip obj = new ReadZip();        
        String str = "C:\\git-demo\\practice\\asa.zip";
        obj.printFileContent(str);
    }
	
}
