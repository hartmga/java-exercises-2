package com.hcl.java02;

public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("Canus", 6, 51.7);
		Dog d2 = new Dog("Fido");
		System.out.println(d1);
		System.out.println(d2);
		d1.showExcitement();
		d2.showExcitement(3);
		d1.showExcitement(6);
		d2.showExcitement(19);
		d1.eating();
		d2.eating("lettuce");
	}
}
