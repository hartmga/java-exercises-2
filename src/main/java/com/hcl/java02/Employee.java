package com.hcl.java02;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String fn, String ln, double ms) {
		setFirstName(fn);
		setLastName(ln);
		// salary is only set if positive
		if (ms > 0)
			setMonthlySalary(ms);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}

}
