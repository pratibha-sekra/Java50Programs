package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class CountWordsinFile {
	
	public static void main (String args[])  throws IOException {

	       //System.out.println ("Counting Words");       
		
		BufferedReader br = null;
	        try {
				br = new BufferedReader (new FileReader ("D:/test.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
	       String line = br.readLine();
	       int count = 0;
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	          line = br.readLine();
	       }         
	       System.out.println(count);
	       br.close();
	       
	    
	}

}
