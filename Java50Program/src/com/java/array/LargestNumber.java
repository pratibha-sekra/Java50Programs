package com.java.array;

public class LargestNumber {

	public static void main(String[] args) {
		int array[]= {2,5,4,9,10};
		int largest= array[0];
		for(int i=1; i<array.length; i++){
			if(array[i]>largest){
				largest= array[i];
			}
		}
		System.out.println("Largest number of this array is :"+largest);

	}

}
