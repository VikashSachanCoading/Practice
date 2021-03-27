package com.employee;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	int empID;
	String name;
	
	public Employee() {
		super();
	}
	public Employee(int empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + "]";
	}
	public boolean equals(Object o) 
	{
		if(o==null || getClass()!=o.getClass()) 
		{
			return false;
		}
		if(this == o) 
		{
			return true;
		}
		Employee e = (Employee)o;
		return(this.getEmpID()==e.getEmpID());
	}
	public int hashcode() 
	{
		return getEmpID();
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.empID - o.empID;
	}
	
//	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
//		
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			return e1.getName().compareTo(e2.getName());
//		}
//	};
	
	public static Comparator<Employee> NameComparator = (e1, e2) -> {return e1.getName().compareTo(e2.getName());};

}
