package com.hcl.java02;

public class Dog {
	private String name = "Rex";
	private int age = 3;
	private double weight = 40;

	public Dog(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Dog(String name) {
		super();
		this.name = name;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void showExcitement() {
		System.out.println(name + " is wagging its tail.");
	}

	public void showExcitement(int level) {
		if (level < 4)
			showExcitement();
		else if (level < 8)
			System.out.println(name + " is wagging its tail vigorously.");
		else
			System.out.println(name + " is wagging its tail vigorously and jumping.");
	}

	public void eating() {
		System.out.println("eating");
	}

	public void eating(String food) {
		System.out.println("eating (" + food + ")");
	}

}
