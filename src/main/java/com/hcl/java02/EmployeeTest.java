package com.hcl.java02;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", 40000);
		Employee emp2 = new Employee("Jane", "Smith", 40000);
		System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getMonthlySalary());
		System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getMonthlySalary());
		emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1); // give 10% raise
		emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1); // give 10% raise
		System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getMonthlySalary());
		System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getMonthlySalary());

	}

}
