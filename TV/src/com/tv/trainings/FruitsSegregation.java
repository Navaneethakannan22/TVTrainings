package com.tv.trainings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsSegregation {
	Apple a1, a2;
	Banana b1, b2, b3;
	Orange o1;

	@Test
	public void addFruits() {
		a1 = new Apple("Red", 150);
		a2 = new Apple("Green", 250);

		b1 = new Banana("Yellow", 30);
		b2 = new Banana("Green", 50);
		b3 = new Banana("Red", 80);

		o1 = new Orange("Orange", 200);
	}

	@Test
	public void getGreenApplePrice() {
		System.out.println("Green apple is: " + a2.getPrice() + "/Kg");
	}

	@Test
	public void getOrangePrice() {
		System.out.println("Orange is: " + o1.getPrice() + "/Kg");
	}

	@Test
	public void validateAppleCount() {
		Assert.assertEquals(Apple.count, 2);
	}

	@Test
	public void validateBananaCount() {
		Assert.assertEquals(Banana.count, 3);
	}

}
