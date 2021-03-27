package com.comparableCheck;

import java.util.Arrays;

import com.employee.Employee;

public class MainClass {

	public static void main(String[] args) {

		int[] intArr = {5,9,1,10};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(5, "John");
		empArr[1] = new Employee(9, "Amit");
		empArr[2] = new Employee(1, "Paul");
		empArr[3] = new Employee(10, "Ame");
		Arrays.sort(empArr, (e1, e2) -> {return e1.getName().compareTo(e2.getName());	});
		
		System.out.println("Default Sorting of Employee list :\n" +Arrays.toString(empArr));
		
	}

}
