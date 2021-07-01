package com.hcl.java02;

public class Invoice {

	private String partNumber;
	private String description;
	private int quantity;
	private double price;

	public Invoice(String num, String desc, int quant, double pr) {
		partNumber = num;
		description = desc;

		// quantity and price must not be negative
		quantity = quant > 0 ? quant : 0;
		price = pr >= 0 ? pr : 0;
	}

	public double getInvoiceAmount() {
		return quantity * price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String s) {
		partNumber = s;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String s) {
		description = s;
		;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int n) {
		quantity = n >= 0 ? n : 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		price = d >= 0 ? d : 0;
	}

}
