package com.java.array;

public class MIssingNumber {

	public static void main(String[] args) {
		int arr[]={101,102,104,105,106};
		int firstNum=arr[0];
		int lastNum= arr[(arr.length)-1];
		System.out.println(firstNum+" "+lastNum);
		int sum=((lastNum*(lastNum+1))/2)-((firstNum*(firstNum-1))/2);
		System.out.println(sum);
		for(int i=0; i<arr.length; i++){
			//sum= sum-arr[i];
			if(firstNum!=arr[i]){
				System.out.println(firstNum);
			    break;}
			firstNum++;
			}
		//System.out.println(sum);
	}

}
