package com.java.array;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int arrayOne[]= {4,5,3,7,8};
		int arrayTwo[]= {14,15,13,17,18};
		int i,j;
		int mergedArray[]= new int[10];
		for(i=0,j=0; i<arrayOne.length; i++,j++){
			mergedArray[j]=arrayOne[i];
		}
		for(i=0; i<arrayTwo.length; i++,j++){
			mergedArray[j]=arrayTwo[i];	
		}
		System.out.println(Arrays.toString(mergedArray));
	}

}
