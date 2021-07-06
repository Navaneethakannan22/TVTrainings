package com.tv.trainings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FruitsSegregation {
	Fruit a1, a2, b1, b2, b3, o1;

	List<Fruit> fruits = new ArrayList<>();
	Apple apple = new Apple();
	Banana banana = new Banana();
	Orange orange = new Orange();

	@Test
	public void T01_addFruits() {
		a1 = new Apple("Red", 150);
		a2 = new Apple("Green", 250);

		b1 = new Banana("Yellow", 30);
		b2 = new Banana("Green", 50);
		b3 = new Banana("Red", 80);

		o1 = new Orange("Orange", 200);

		fruits.addAll(Arrays.asList(a1, a2, b1, b2, b3, o1));
		Reporter.log(fruits.size() + " Fruits were added into the Bowl", true);
	}

	@Test
	public void T02_segregateFruits() {
		apple.segregateAppleFruit(fruits);
		banana.segregateBananaFruit(fruits);
		orange.segregateOrangeFruit(fruits);
		
		Reporter.log("Fruits were segregated into their respective bowls", true);
	}

	@Test
	public void T03_getGreenApplePrice() {
		System.out.println("Green apple is: " + a2.getPrice() + "/Kg");
	}

	@Test
	public void T04_getOrangePrice() {
		System.out.println("Orange is: " + o1.getPrice() + "/Kg");
	}
	
	@Test
	public void T05_validateAppleCount() {
		Assert.assertEquals(apple.getAppleCount(), 2);
		Reporter.log("Apple count is matched with Apple in fruits bowl", true);
	}

	@Test
	public void T06_validateBananaCount() {
		Assert.assertEquals(banana.getBananaCount(), 3);
		Reporter.log("Banana count is matched with Banana in fruits bowl", true);
	}

}
