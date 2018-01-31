package com.java.StringProg;

public class ParenthesisString {

	public static void main(String[] args) {
		String parenthesis= "((()))((()";
		int counter=0;
		for(int i=0; i<parenthesis.length(); i++){
			if(parenthesis.charAt(i)=='('){
				counter=counter+1;
			}
			else if(parenthesis.charAt(i)==')'){
				counter=counter-1;
			}
			else{
				System.out.println("invalid input");
				break;
			}
			if(counter<0){
				break;
			}
		}
		if(counter!=0 || counter<0){
		System.out.println("invalid string: "+counter);
		}
		else{
			System.out.println("valid string");
		}

	}

}
