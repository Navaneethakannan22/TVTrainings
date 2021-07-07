package com.tv.trainings;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FruitsTest {
	Fruits a1, a2, a3, b1, b2, b3, o1;
	Bowl bowl = new Bowl();

	@BeforeClass
	public void T01_addFruits() {
		a1 = new Apple("Red", "small", 150);
		a2 = new Apple("Green", "medium", 250);
		a3 = new Apple("pink", "medium", 200);

		b1 = new Banana("Yellow", "small", 30);
		b2 = new Banana("Green", "large", 50);
		b3 = new Banana("Red", "medium", 80);

		o1 = new Orange("Orange", "medium", 200);

		bowl.addFruits(a1, a2,a3, b1, b2, b3, o1);
		Reporter.log(bowl.getFruitsCountInBowl() + " Fruits were added into the Bowl", true);
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T02_validateAppleBowl() {
		List<Fruits> apples = bowl.getAllApples();
		Assert.assertTrue(apples.stream().parallel().allMatch(fruit -> fruit instanceof Apple));

		Reporter.log("The Bowl contains only apples in it with the count of" + apples.size());
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T03_validateBananaBowl() {
		List<Fruits> bananas = bowl.getAllBananas();
		Assert.assertTrue(bananas.stream().parallel().allMatch(fruit -> fruit instanceof Banana));

		Reporter.log("The Bowl contains only apples in it with the count of" + bananas.size());
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T04_validateOrangeBowl() {
		List<Fruits> oranges = bowl.getAllOranges();
		Assert.assertTrue(oranges.stream().parallel().allMatch(fruit -> fruit instanceof Orange));

		Reporter.log("The Bowl contains only apples in it with the count of" + oranges.size());
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T05_removeAllApples() {
		bowl.removeFruits(a1, a2, a3);
		Assert.assertEquals(bowl.getAllApples().size(), 0);

		Reporter.log("All apples were eaten");
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T06_getGreenApplePrice() {
		System.out.println("Green apple is: " + a2.getPrice() + "/Kg");
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T07_getOrangePrice() {
		System.out.println("Orange is: " + o1.getPrice() + "/Kg");
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void T08_validateBananaCount() {
		Assert.assertEquals(bowl.getAllBananas().size(), 3);
		Reporter.log("Banana count is matched with Banana in fruits bowl", true);
		Reporter.log("=================================EOT======================================", true);
	}

}
