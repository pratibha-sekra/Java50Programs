package com.java.file;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContentToNewfile {

	public static void main(String[] args)  throws IOException {

		BufferedReader br = null;
        try {
			br = new BufferedReader (new FileReader ("D:/test1.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}     
     
        String line;
        String Finalstr = "";
        
        while ((line = br.readLine()) != null) {
            Finalstr += line;
        }
        br.close();
       // Finalstr = Finalstr.replaceAll(StringToFind, StringToReplace);
        File file2 = new File("D:/test22.txt");
		if (file2.exists()){
		     file2.delete();
		 }  
        FileWriter fw = new FileWriter(file2);
        
      
        fw.write(Finalstr);
        fw.close();
        
        System.out.println("Done Copying file !!!");
        
	}

}
