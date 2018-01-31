package com.java.file;

import java.io.File;
import java.io.IOException;

public class ListofFiles {

	public static void main(String[] args) throws IOException  {
		
		  File Dir = new File("D:");
		  File[] filesList = Dir.listFiles();
	        for(File f : filesList){
	            if(f.isDirectory())
	                System.out.println(" Directory : "+f.getName());
	            if(f.isFile()){
	                System.out.println(" File      : "+f.getName());
	            }
	        }
	}

}
