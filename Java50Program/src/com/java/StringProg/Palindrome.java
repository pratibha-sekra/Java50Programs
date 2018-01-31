package com.java.StringProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a String: ");
        try {
			String originalString = reader.readLine();
			Palindrome pd= new Palindrome();
		    boolean result= pd.checkPalindrome(originalString);
		    System.out.println("This is Palindrome: "+result);
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}
	public boolean checkPalindrome(String s){
		String reverseString= "";
		for(int i=s.length()-1;i>=0;i--)
        {
    	reverseString= reverseString+s.charAt(i);
        }
    System.out.println("Reverse string is : "+ reverseString);
    if(reverseString.equals(s))
    	return true;
    else
    	return false;
	}
	}


