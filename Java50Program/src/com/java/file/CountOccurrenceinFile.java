package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrenceinFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
        try {
			br = new BufferedReader (new FileReader ("D:/test.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}     
       String line = br.readLine();
       String teststring = "Write";
       int count = 0;
       while (line != null) {
          String []parts = line.split(" ");
          for( String w : parts)
          {
            if(w.equals(teststring)) count++;       
          }
          line = br.readLine();
       }         
       System.out.println(count);
       br.close();

	}

}
