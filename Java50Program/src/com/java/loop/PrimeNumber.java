package com.java.loop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = input.nextInt();
		PrimeNumber pn= new PrimeNumber();
		boolean result= pn.isPrime(number);
		
		System.out.println(number+" is boolean :"+result);
		input.close();
	}
	public boolean isPrime(int num)
	{
		if (num==1)
			return false;
		for(int i=2; i<=(num/2); i++)
		{
			if(num%i==0)
				return false;
		}
		return 
				true;
	}

}
