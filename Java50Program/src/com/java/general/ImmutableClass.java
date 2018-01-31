package com.java.general;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Age age;

    public ImmutableClass(int id, String name, Age age) {
    this.name = name;
    this.id = id;
 //   this.age= age;
//    Age cloneAge = new Age();
//    cloneAge.setDay(age.getDay());
//    cloneAge.setMonth(age.getMonth());
//    cloneAge.setYear(age.getYear());
//    this.age = cloneAge;
    
     this.age = age;
    }

    public int getId() {
    return id;
    }

    public String getName() {
    return name;
    }

    public Age getAge() {
    	
     Age myAgeObj = new Age();
     myAgeObj.setDay(this.age.getDay());
     myAgeObj.setMonth(this.age.getMonth());
     myAgeObj.setYear(this.age.getYear());
    return myAgeObj;
    }
	
}
