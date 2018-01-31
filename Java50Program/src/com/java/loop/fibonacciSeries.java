package com.java.loop;
import java.util.Scanner;

public class fibonacciSeries {
	
	public static void main(String[] args){
		double X=0;
		double Y=1;
		int number;
		int count=2;
	
    Scanner input = new Scanner(System.in);
	System.out.println("enter the desired length of Fibonacci series in integer: ");
	number = input.nextInt();
	System.out.println("1: "+1);
	for(int i=1; i<=number-1; i++){
		
	double Z=X+Y;
		System.out.println(count+": "+Z);
		X=Y;
		Y=Z;
		count++;
	}
	 input.close();
	}
	
}
