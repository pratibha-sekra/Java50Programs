package com.java.collection;

import java.util.Comparator;
import java.util.Map;

public class ComparatorClassSortByValue implements Comparator<Integer>{
	public Map<Integer,String> testMap;
	
	public ComparatorClassSortByValue(Map<Integer,String> testMap){
		this.testMap= testMap; 
	}

	public int compare(Integer o1, Integer o2) {
		
		return testMap.get(o1).compareTo(testMap.get(o2));
	}

}
