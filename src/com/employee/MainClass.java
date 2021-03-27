package com.employee;

public class MainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEmpID(1);
		e1.setName("Vikash");
		
		Employee e2 = new Employee();
		e2.setEmpID(1);
		e2.setName("Vikash");
		
		System.out.println("Shallow compare " +(e1 == e2));
		System.out.println("Deep compare " +(e1.equals(e2)));
	}

}
