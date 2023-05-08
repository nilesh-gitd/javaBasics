package com.p;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWord {

	static void replace(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);         
        String oldContent = "";       
        BufferedReader reader = null;       
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }

            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);       
            writer.write(newContent);
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }
    public static void main(String[] args)
    {
        replace("C:\\git-demo\\practice\\createdFile.txt", "by", "my");
        System.out.println("done");
    }
}
