package com.tv.trainings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsSegregation {
	Fruit a1, a2,b1, b2, b3,o1;


	@Test
	public void T01_addFruits() {
		a1 = new Apple("Red", 150);
		a2 = new Apple("Green", 250);

		b1 = new Banana("Yellow", 30);
		b2 = new Banana("Green", 50);
		b3 = new Banana("Red", 80);

		o1 = new Orange("Orange", 200);
	}

	@Test
	public void T02_getGreenApplePrice() {
		System.out.println("Green apple is: " + a2.getPrice() + "/Kg");
	}

	@Test
	public void T03_getOrangePrice() {
		System.out.println("Orange is: " + o1.getPrice() + "/Kg");
	}

	@Test
	public void T04_validateAppleCount() {
		Assert.assertEquals(Apple.count, 2);
	}

	@Test
	public void T05_validateBananaCount() {
		Assert.assertEquals(Banana.count, 3);
	}

}
