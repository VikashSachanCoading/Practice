package com.codedecode;

public class MainClass {

	public static void main(String[] args) {
		Animal.legs = 4;
		Dog tommy = new Dog("Black");
		tommy.barking();
		tommy.wagTail();
		System.out.println("Name of Dog is "+tommy.getName());
		
		Dog seru = new Dog("Brown");
		seru.eating();
		System.out.println("Tag Number of Dog is "+seru.getTagNumber());
		System.out.println("Total Walking Distance of Dog is "+seru.getDogWalkingDistance());
		System.out.println("Total Dog Count in Area is "+seru.getDogCount());
		System.out.println("Vaccine Inject to Dog is "+seru.isVaccineInject());
		
		seru.wagTail();
		System.out.println("Dog has " +seru.getEyes()+ " eyes");
		Labrador labrador = new Labrador("Black");
		System.out.println("Labrador has " +labrador.eyes+ " eyes");
		labrador.barking();
	}

}
