package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceStringinFile {
	public static void main (String args[])  throws IOException {

	       //System.out.println ("Counting Words");       
		
		BufferedReader br = null;
	        try {
				br = new BufferedReader (new FileReader ("D:/test1.txt"));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}     
	      // String line = br.readLine();
	       // FileWriter fw =null;
	        String line;
	        String Finalstr = "";
	        
	        String StringToFind = "program";
	        String StringToReplace = "Function";
	        
	       // String StringToFind = "Function";
	       // String StringToReplace = "program";
	        
	     
	       while ((line = br.readLine()) != null) {
	            Finalstr += line;
	        }
	        Finalstr = Finalstr.replaceAll(StringToFind, StringToReplace);
	        FileWriter fw = new FileWriter("D:/test1.txt");
	        fw.write(Finalstr);
	        fw.close();
	        
	        System.out.println("Done Replacing string !!!");
	        br.close();
	       
	    
	}


}
