package com.hcl.java02;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1 = new Invoice("ae45", "fake item", 4, 5.6);
		System.out.println(i1.getInvoiceAmount()); // should be 22.4
		Invoice i2 = new Invoice("12345", "another item", -2, 3);
		System.out.println(i2.getQuantity()); // should be 0
		Invoice i3 = new Invoice("54321", "third item", 2, -3);
		System.out.println(i3.getPrice()); // should be 0.0
	}

}
