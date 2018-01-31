package com.java.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputByBufferedReaderClass {

	public static void main(String[] args) {
		int numberOne=0;
		int numberTwo=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter two numbers: ");
		 try {
			String inputOne= reader.readLine();
			 numberOne= Integer.parseInt(inputOne);
			 String inputTwo= reader.readLine();
			 numberTwo= Integer.parseInt(inputTwo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int result= numberOne-numberTwo;
		System.out.println(result);
		 try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
