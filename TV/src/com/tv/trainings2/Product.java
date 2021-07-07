package com.tv.trainings2;

public class Product {
	String name;
	String brand;
	String color;
	long basePrice;
	boolean isGstApplicable;
	private int gstPercentage = 18;

	Product(String name, String brand, String color, int basePrice, boolean isGstApplicable) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.basePrice = basePrice;
		this.isGstApplicable = isGstApplicable;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getspecifications() {
		return color;
	}

	public long getBasePrice() {
		return basePrice;
	}

	public boolean isProductElibleForGst() {
		return isGstApplicable;
	}

	public int getProductGstPercenatge() {
		return gstPercentage;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " Price: " + getBasePrice() + '\n';
	}
}
