package com.java.StringProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertString {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a sentence: ");
        try {
			String originalString = reader.readLine();
			ConvertString cs= new ConvertString();
		    String result= cs.convertedString(originalString);
		    System.out.println("Result string: "+result);
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}
	public String convertedString(String s){
		String newString= "";
		String word[]= s.split("\\s");
		for(int i=0; i<word.length; i++){
			newString= newString+word[i]+(i+1)+" ";
		}
		return newString;
	}
}
