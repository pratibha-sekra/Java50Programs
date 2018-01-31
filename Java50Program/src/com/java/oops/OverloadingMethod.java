package com.java.oops;

public class OverloadingMethod {

	public static void main(String[] args) {
		OverloadingMethod om= new OverloadingMethod();
		int result1= om.addition(2,3);
		System.out.println("Result of first method: "+result1);
		int result2= om.addition(3,4,7);
		System.out.println("Result of second method: "+result2);
		float result3= om.addition(3,6,5.7f);
		System.out.println("Result of first method: "+result3);
	}
	public int addition(int a, int b){
		int c=0;
		c= a+b;
		return c;
	}
	public float addition(int a, int b,float c){
		float d= 0.0f;
		d= a+b+c;
		return d;
	}
	public int addition(int a, int b,int c){
		int d= 0;
		d= a+b+c;
		return d;
	}
}
