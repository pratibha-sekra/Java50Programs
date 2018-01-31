package com.java.loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = input.nextInt();
		Factorial fact= new Factorial();
		int result= fact.factWithoutRecursion(a);
		System.out.println("Fcatorial of "+a+" without recursion :"+result);
		result= fact.factWithRecursion(a);
		System.out.println("Fcatorial of "+a+" without recursion :"+result);
		input.close();
	}
	public int factWithoutRecursion(int n){
		int factorial=1;
		for(int i=1; i<=n; i++){
			factorial= factorial*i;
		}
		return factorial;
	}
	public int factWithRecursion(int n){
		if (n==1)
			return 1;
		else
			return n*factWithRecursion(n-1);
	}
	
}
