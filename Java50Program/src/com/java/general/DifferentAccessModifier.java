package com.java.general;

public class DifferentAccessModifier {
	
	public void publicMethod(){
		System.out.println("I am public method");
	}
	private void privateMethod(){
		System.out.println("i am private method");
	}
	void defaultMethod(){
		privateMethod();// here we are using private method in the same class because
		                // we can not access private method outside the class
		System.out.println("I am default method");
	}
	protected void protectedMethod(){
		System.out.println("I am protected method");
	}
}
