package com.tv.trainings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bowl {
	String shape;
	List<Fruits> fruits;

	Bowl() {
		fruits = new ArrayList<Fruits>();
	}

	public void addFruits(Fruits... f) {
		fruits.addAll(Arrays.asList(f));
	}

	public void removeFruits(Fruits... f) {
		fruits.removeAll(Arrays.asList(f));
	}

	public int getFruitsCountInBowl() {
		return fruits.size();
	}

	public List<Fruits> getAllApples() {
		ArrayList<Fruits> apples = new ArrayList<>();

		for (Fruits fruit : fruits) {
			if (fruit instanceof Apple) {
				apples.add(fruit);
			}
		}
		return apples;
	}

	public List<Fruits> getAllBananas() {
		ArrayList<Fruits> bananas = new ArrayList<>();

		for (Fruits fruit : fruits) {
			if (fruit instanceof Banana) {
				bananas.add(fruit);
			}
		}
		return bananas;
	}

	public List<Fruits> getAllOranges() {
		ArrayList<Fruits> oranges = new ArrayList<>();

		for (Fruits fruit : fruits) {
			if (fruit instanceof Orange) {
				oranges.add(fruit);
			}
		}
		return oranges;
	}
}
