package com.java.loop;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = input.nextInt();
		ArmstrongNumber an= new ArmstrongNumber();
		boolean result= an.calculateArmstrongNumber(number);
		System.out.println("Result :"+result);
		input.close();		
	}
	public int lengthOfNumber(int num){
		int length=1;
		while(num>9)
		{
			length++;
			num=num/10;	
		}
		System.out.println(length);
		return length;	
	}
	public boolean calculateArmstrongNumber(int num){
		int finalNumber=0;
		int length= lengthOfNumber(num);
		int origNum=num;
	while(num>9)
	{
		finalNumber=(int) (finalNumber+Math.pow((num%10),length));
		
		num=num/10;
	}
		finalNumber=(int) (finalNumber+Math.pow((num),length));
		
	System.out.println("Calculated number :"+finalNumber);
	if(finalNumber==origNum)
		 return true;
		else
			return false;
	
	}

}
