package com.hcl.java02;

public class Person {

	private String name;
	private int age;
	private int shoeSize;

	public Person(String name, int age, int shoeSize) {
		super();
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	private void walking() {
		System.out.println("Person with name " + name + ", age " + age + ", and shoe size " + shoeSize + " is walking");
	}

	public void startWalking() {
		walking();
	}

}
