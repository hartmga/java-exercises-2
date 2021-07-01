package com.hcl.java02;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		this.setMonth(month);
		this.setYear(year);
		this.setDay(day);
	}

	public void displayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
