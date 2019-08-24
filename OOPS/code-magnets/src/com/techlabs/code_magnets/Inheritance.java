package com.techlabs.code_magnets;

public class Inheritance {
	 public static void main(String[] args){ 
	       
	        Parent obj1 = new Parent(); 
	        obj1.show(); 
	  
	       
	        Parent obj2 = new Child(); 
	        obj2.show(); 
	        Child obj3=new Child();
	        obj3.show();
	    }
}
 

	class Parent { 
	    void show() 
	    { 
	        System.out.println("Parent's show()"); 
	    } 
	} 
	  
	// Inherited class 
	class Child extends Parent { 
	    // This method overrides show() of Parent 
	    @Override
	    void show() 
	    { 
	        System.out.println("Child's show()"); 
	    } 
	} 


