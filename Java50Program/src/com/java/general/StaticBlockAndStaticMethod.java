package com.java.general;

public class StaticBlockAndStaticMethod {
	    static int i;
	    int j;
	    public static void main(String args[]) {
	   	 
	    	StaticBlockAndStaticMethod t1 = new StaticBlockAndStaticMethod();
	    	StaticBlockAndStaticMethod t2 = new StaticBlockAndStaticMethod();
	    	StaticBlockAndStaticMethod.staticMethod();
	    }
	    static {
	        i = 10;
	        System.out.println("static block called ");
	    }
	    StaticBlockAndStaticMethod(){
	        System.out.println("Constructor called");
	    }
	    public static void staticMethod(){
	    	System.out.println("Static method called");
	    }

}
