package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
		MapMethods mm= new MapMethods();
		String valueOfKey= mm.searchKayInHashMap();
		System.out.println(valueOfKey);

	}
	public Map createHashMap(){
		Map<Integer,String> myMap= new HashMap<Integer,String>();
		myMap.put(101, "abc");
		myMap.put(104, "sds");
		myMap.put(107, "tyr");
		myMap.put(103, "hjh");
		myMap.put(109, "wewr");
		return myMap;
	}
	public String searchKayInHashMap(){
		String value ="";
		Map map= createHashMap();
		if(map.containsKey(104)){
			value=(String) map.get(104);
		}else{
			System.out.println("Key dosen't exist");
		}
		return value;
	}
}
