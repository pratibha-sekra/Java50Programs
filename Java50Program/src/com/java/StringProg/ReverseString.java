package com.java.StringProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a String: ");
        try {
			String originalString = reader.readLine();
			ReverseString rs= new ReverseString();
		    String result= rs.checkReverseString(originalString);
		    System.out.println("This is reverse string: "+result);
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}
	public String checkReverseString(String s){
		String reverseString= "";
		for(int i=s.length()-1;i>=0;i--)
        {
    	reverseString= reverseString+s.charAt(i);
        }
		return reverseString;
	}

}
