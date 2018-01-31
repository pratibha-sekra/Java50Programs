package com.java.array;

public class CommonNumber {

	public static void main(String[] args) {
		int arrayOne[]= {2,5,4,9,10,0};
		int arrayTwo[]= {1,3,4,5,8,7,0};
		for(int i=0; i<arrayOne.length; i++){
			for(int j=0; j<arrayTwo.length; j++){
				if(arrayOne[i]==arrayTwo[j])
					System.out.println(arrayOne[i]);
			   }
		   }
	}
}
