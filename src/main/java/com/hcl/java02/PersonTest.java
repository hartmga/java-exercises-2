package com.hcl.java02;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("James", 45, 8);
		p1.startWalking();
		p1.setAge(p1.getAge() + 2);
		p1.setShoeSize(p1.getShoeSize() + 1);
		p1.startWalking();
	}

}
