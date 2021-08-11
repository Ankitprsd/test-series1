package com.Techment.day8.collections;
class nameLengthException extends Exception{  
	 nameLengthException(String s){  
	  super(s);  
	 }  
	} 

public class TestQuestion3 {

	private  String firstName;
	private String lastName;
	
	public TestQuestion3(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	static void validateEntry(String firstName, String lastName )throws NullPointerException{  
	     if((firstName.trim().length()==0) && (lastName.trim().length()==0)) {
	    	 throw new NullPointerException("entry missing");  
	     }
	}
	
	static void validateLength(String firstName, String lastName)throws nameLengthException{  
	     if((firstName.trim().length()<3) && (lastName.trim().length()<3)) {
	    	 throw new nameLengthException("name should be minimum 3 characters");  
	     }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
			TestQuestion3 emp1 = new TestQuestion3("Ajay", "Kumar");
	    	validateEntry(emp1.firstName, emp1.lastName);
	    	validateLength(emp1.firstName, emp1.lastName);	    	
	    }catch(Exception m){
	    	System.out.println("Exception occured: "+m);
	    }
	}

}
