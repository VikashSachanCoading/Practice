package com.codedecode;


public class Dog extends Animal{
	
	private String color;
	private int tagNumber;
	private double dogWalkingDistance;
	private long dogCount;
	private boolean vaccineInject;
	private String name;
	private String bread;
	
	public Dog(String color) {
		this.color = color;
	}
	public void wagTail() {
		System.out.println(color+" Dog wag there tail having "+Animal.legs+" Legs");
	}
	public void barking() {
		System.out.println(color+" Dog barks");
	}
	public void eating() {
		String food = "Pedigree";
		System.out.println(color+" Dog eat "+food);
	}
	public String getColor() {
		return color;
	}
	public int getTagNumber() {
		return tagNumber;
	}
	public double getDogWalkingDistance() {
		return dogWalkingDistance;
	}
	public long getDogCount() {
		return dogCount;
	}
	public boolean isVaccineInject() {
		return vaccineInject;
	}
	public String getName() {
		return name;
	}
	public String getBread() {
		return bread;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setTagNumber(int tagNumber) {
		this.tagNumber = tagNumber;
	}
	public void setDogWalkingDistance(double dogWalkingDistance) {
		this.dogWalkingDistance = dogWalkingDistance;
	}
	public void setDogCount(long dogCount) {
		this.dogCount = dogCount;
	}
	public void setVaccineInject(boolean vaccineInject) {
		this.vaccineInject = vaccineInject;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}

}
