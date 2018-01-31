package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		DuplicatesInArray da= new DuplicatesInArray();
		int[] array={3,5,6,8,6,5,3};
		 da.duplicates(array);
	}
	public void duplicates( int[] array )
	{
	  Set<Integer> set = new HashSet<Integer>();
	  System.out.print("Dulicates numbers are : ");
	  for (int i : array)
	  {
	    if (set.contains(i)){
	    	System.out.print(" "+i);
	    }
	    else{
	    	set.add(i);
	    }
	  } 
	}
}
