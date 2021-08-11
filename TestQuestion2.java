package com.Techment.day8.collections;
class Employee9
{
	String FirstName;
	String LastName;
	public Employee9(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}

public class TestQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee9 employee1 =new Employee9("Ankit", "Kumar");
		Employee9 employee2 =new Employee9("Akhil", "Sagar");
		Employee9 employee3 =new Employee9("Rahul", "KUmar");
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		
		

	}

}
