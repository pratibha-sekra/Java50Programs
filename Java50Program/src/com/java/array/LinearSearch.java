package com.java.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int array[]= {2,5,4,9,10,0};
		int flag=0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numbert : ");
		int number = input.nextInt();
		for(int i=0; i<array.length; i++){
				if(array[i]==number){
					System.out.println("Number "+number+" is at "+(i+1)+" position of this array");
				    flag=1;
					}
		   }
		if (flag==0){
			System.out.println("This number is not in the array");
		 	}
       input.close();
	}

}
