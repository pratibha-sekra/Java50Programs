package com.java.oops;

public abstract class Shape {
	
	int noOfSides;
	double area;
	double parimeter;
	
	public abstract void calculateArea();
	public abstract void calculateParimeter();
	public void setSides(int sides){
		noOfSides= sides;
	}

}
