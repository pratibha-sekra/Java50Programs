package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListToArray {

	public static void main(String[] args) {
		
		CopyArrayListToArray ar= new CopyArrayListToArray();
		ar.listToArrayConversion();
	}
	public List createListAddElements(){
//		Scanner input = new Scanner(System.in);
//		System.out.println("enter numbers to add in list: ");
//		int a1 = input.nextInt();
//		int a2 = input.nextInt();
//		int a3 = input.nextInt();
//		int a4 = input.nextInt();
//		int a5 = input.nextInt();
		List<Integer> firstList= new ArrayList<Integer>();
		firstList.add(101);
		firstList.add(678);
		firstList.add(329);
		firstList.add(984);
		firstList.add(183);
//		firstList.add(a1);
//		firstList.add(a2);
//		firstList.add(a3);
//		firstList.add(a4);
//		firstList.add(a5);
		return firstList;
	}
	public Integer[] listToArrayConversion(){
		List myList= createListAddElements();
		Integer[] array =(Integer[]) myList.toArray(new Integer[myList.size()]);

		//Integer[] array= (Integer[])myList.toArray();
		for(int ele: array){
		System.out.println(ele);
		}
		return array;
	}

}
