package com.codedecode;

public class OverloadingExample {
	public void add(long a, int b) {
		System.out.println("Add Method With 2 Args " +(a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Add Method Wtih 3 Arg " +(a+b+c));
	}
	public void add(int a, long b) {
		System.out.println("Add Method with 2 Arg " +(a+b));
		
	}

}
