package com.java.collection;

import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		SortMapByValue smv= new SortMapByValue();
		smv.sortTreeMap();

	}
	public void sortTreeMap(){
		Map<Integer,String> mapUnsorted= new HashMap<Integer,String>();
		Map<Integer,String> myMap= new TreeMap<Integer,String>(new ComparatorClassSortByValue(mapUnsorted));
		mapUnsorted.put(101, "zhg");
		mapUnsorted.put(104, "dbh");
		mapUnsorted.put(107, "abc");
		mapUnsorted.put(103, "hjh");
		mapUnsorted.put(109, "wewr");
		myMap.putAll(mapUnsorted);
		Set<Integer> keys= myMap.keySet();
		for(Integer key: keys){
		System.out.println(key+" "+myMap.get(key));
		}
		
	}
	

}
