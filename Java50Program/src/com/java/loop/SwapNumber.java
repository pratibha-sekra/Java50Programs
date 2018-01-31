package com.java.loop;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter two number: ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		SwapNumber sn= new SwapNumber();
		sn.withThirdVariable(firstNumber, secondNumber);
		sn.withoutThirdVariable(firstNumber, secondNumber);
		input.close();
	}
	public void withoutThirdVariable(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Result without using third variable: "+a+" "+b);
	}
	public void withThirdVariable(int a, int b){
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("Result with using third variable: "+a+" "+b);
	}

}
