package com.java.collection;

import java.util.EnumSet;

public class EnumHavingMonths {

	public static void main(String[] args) {
		for ( MonthsOfYear months : EnumSet.allOf( MonthsOfYear.class)) {
		    System.out.println(months);
		}

	}

}
