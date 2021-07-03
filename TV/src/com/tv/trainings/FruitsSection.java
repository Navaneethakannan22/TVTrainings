package com.tv.trainings;

class Fruit {
	private String color;
	private int pricePerKg;

	Fruit(String color, int pricePerKg) {
		this.color = color;
		this.pricePerKg = pricePerKg;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return pricePerKg;
	}
}

class Apple extends Fruit {
	static int count;

	Apple(String color, int pricePerKg) {
		super(color, pricePerKg);
		count++;
	}

}

class Banana extends Fruit {
	static int count;

	Banana(String color, int pricePerKg) {
		super(color, pricePerKg);
		count++;
	}
	
}

class Orange extends Fruit {
	static int count;

	Orange(String color, int pricePerKg) {
		super(color, pricePerKg);
		count++;
	}
	
}
