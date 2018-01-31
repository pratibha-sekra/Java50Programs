package com.java.loop;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			System.out.println("enter a number: ");
			int number = input.nextInt();
			FizzBuzz fb= new FizzBuzz();
			fb.checkNumber(number);
		    input.close();
	}
public void checkNumber(int num){
	for(int i=1; i<=num; i++)
    {
       if (i%3==0 && i%5==0)
        	{
    	   		System.out.print("\tFizzBuzz");
    	   		continue;}
       else 
	   		{
    	   		if (i%3==0)
    	   			{
    	   				System.out.print("\tFizz");
    	   				continue;
    	   			}
    	   		else if(i%5==0)
    	   			{
    	   				System.out.println("\tBuzz");
    	   				continue;}
	   				}
	 System.out.print("\t" + i);
}
}

}
