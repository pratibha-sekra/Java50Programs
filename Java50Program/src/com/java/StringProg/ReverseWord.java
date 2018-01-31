package com.java.StringProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a sentence: ");
        try {
			String originalString = reader.readLine();
			ReverseWord rw= new ReverseWord();
		    String result= rw.reverseEachWord(originalString);
		    System.out.println("Result string: "+result);
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}
	public String reverseEachWord(String s){
		String reverseWord= "";
		String word[]= s.split("\\s");
		for(int i=0; i<word.length; i++){
			for(int j=word[i].length()-1;j>=0;j--)
	        {
				reverseWord= reverseWord+word[i].charAt(j);
	        }
			reverseWord= reverseWord+" ";
		}
		return reverseWord;
	}

}
