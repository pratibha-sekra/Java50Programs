package com.java.general;

public class Age {
	private int day;
    private int month;
    private int year;
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
    this.day = day;
    }

    public int getMonth() {
    return month;
    }

    public void setMonth(int month) {
    this.month = month;
    }

    public int getYear() {
    return year;
    }

    public void setYear(int year) {
    this.year = year;
    }


public static void main(String[] args) {
    Age age = new Age();
    age.setDay(1);
    age.setMonth(1);
    age.setYear(1992);
    ImmutableClass student = new ImmutableClass(1, "Alex", age);
    System.out.println("Alex age year before modification = " + student.getAge().getYear());
    //age.setYear(1993);
    student.getAge().setYear(1993);
    System.out.println("Alex age year after modification = " + student.getAge().getYear());
	
}
}