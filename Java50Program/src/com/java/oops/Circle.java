package com.java.oops;

import java.util.Scanner;

public class Circle extends Shape implements ShapeConstant {
	double radius;
	
	
	public Circle(int sides){
		setSides(sides);
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius of circle: ");
		Circle shape= new Circle(0);
		shape.radius=input.nextInt();;
		shape.calculateArea();
		shape.calculateParimeter();
		input.close();
	}

	@Override
	public void calculateArea() {
		double Area= PI*radius*radius;
		System.out.println("Area of this circle is: "+Area);
		
	}

	@Override
	public void calculateParimeter() {
		double parimeter= 2*PI*radius;
		System.out.println("Parimeter of this circle is: "+parimeter);
		
	}
	


}
