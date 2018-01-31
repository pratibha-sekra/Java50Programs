package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.util.Scanner;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayListMethods ar= new ArrayListMethods();
		boolean result= ar.searchElement();
		System.out.println(result);

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
	public void iteratorMethod(){
		List myList= createListAddElements();
		Iterator<Integer> itr= myList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	public void reverseOrder(){
		List myList= createListAddElements();
		ListIterator<Integer> itr= myList.listIterator((myList.size()));
		System.out.println(myList.size());
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
	public boolean searchElement(){
		List myList= createListAddElements();
		boolean result= false;
		if(myList.contains(new Integer(329))){
			result= true;
		}
		else{
			result=false;
		}
		return result;
	}

}
