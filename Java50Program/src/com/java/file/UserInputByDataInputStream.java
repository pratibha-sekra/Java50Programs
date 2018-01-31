package com.java.file;

import java.io.DataInputStream;
import java.io.IOException;

public class UserInputByDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		System.out.println("Enter two numbers");
		String input1=input.readLine();
		//DataInputStream dis = new DataInputStream(System.in);
		String input2=input.readLine();;
		//System.out.print(str);
		int numOne=Integer.parseInt(input1);
		int numTwo=Integer.parseInt(input2);
		int result=numOne*numTwo;
		System.out.println(result);
	}

}
