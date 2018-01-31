package com.java.exceptions;

public class nullPointerExceptionProg {

	public static void main(String[] args) {
		String[] array = new String[5];
		try
	    {
			array[1].toLowerCase();

	    } catch (NullPointerException e)
	    {
	        System.out.println(" !!! Null Exception Caught !!!");
	    }

	}

}
