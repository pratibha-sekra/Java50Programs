package com.java.file;

import java.util.Scanner;

public class InputFromUserByScannerClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int a = input.nextInt();
		int b= input.nextInt();
		int c= a+b;
		System.out.println(c);
		input.close();
		
	}

}
