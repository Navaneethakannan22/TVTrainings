package com.tv.trainings;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	private String color;
	private int pricePerKg;

	Fruit() {
	}

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
	// static int count;
	ArrayList<Object> apple = new ArrayList<>();

	public Apple() {
	}

	Apple(String color, int pricePerKg) {
		super(color, pricePerKg);
	}

	public void segregateAppleFruit(List<Fruit> fruits) {
		for (Fruit fruit : fruits) {
			if (fruit instanceof Apple) {
				apple.add(fruit);
			}
		}
	}

	public int getAppleCount() {
		return apple.size();
	}
}

class Banana extends Fruit {
	// static int count;
	ArrayList<Object> banana = new ArrayList<>();

	public Banana() {
	}

	Banana(String color, int pricePerKg) {
		super(color, pricePerKg);
	}

	public void segregateBananaFruit(List<Fruit> fruits) {
		for (Fruit fruit : fruits) {
			if (fruit instanceof Banana) {
				banana.add(fruit);
			}
		}
	}

	public int getBananaCount() {
		return banana.size();
	}
}

class Orange extends Fruit {
	// static int count;
	ArrayList<Object> orange = new ArrayList<>();

	public Orange() {
	}

	Orange(String color, int pricePerKg) {
		super(color, pricePerKg);
	}

	public void segregateOrangeFruit(List<Fruit> fruits) {
		for (Fruit fruit : fruits) {
			if (fruit instanceof Orange) {
				orange.add(fruit);
			}
		}
	}

	public int getOrangeCount() {
		return orange.size();
	}
}
