package com.java.array;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[]= {64,25,12,22,11};
		int smallestNumberIndex;
		int tempNumber;
		for(int i=0; i<arr.length; i++){
			smallestNumberIndex=i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[smallestNumberIndex]){
					smallestNumberIndex=j;
				}
			}
			tempNumber=arr[smallestNumberIndex];
			arr[smallestNumberIndex]=arr[i];
			arr[i]=tempNumber;
			
			
			System.out.println(arr[i]);
		}
	}
}
