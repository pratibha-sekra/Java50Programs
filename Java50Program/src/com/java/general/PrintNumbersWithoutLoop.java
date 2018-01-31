package com.java.general;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		PrintNumbersWithoutLoop pwl= new PrintNumbersWithoutLoop();
		pwl.increamentNumber(1);

	}
	public  void increamentNumber(int a){
		
		System.out.println(a);
		a++;
		if(a<=10){
			
			increamentNumber(a);
		}
		
	
		
	}

}
