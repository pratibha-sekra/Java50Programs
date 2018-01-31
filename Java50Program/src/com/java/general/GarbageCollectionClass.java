package com.java.general;

public class GarbageCollectionClass {

public static void main(String args[]){  
	GarbageCollectionClass s1=new GarbageCollectionClass();  
	GarbageCollectionClass s2=new GarbageCollectionClass();  
     s1=null;  
     s2=null;  
     System.gc();  
      }  
public void finalize(){System.out.println("object is garbage collected");} 

}
