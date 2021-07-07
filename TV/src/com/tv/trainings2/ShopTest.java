package com.tv.trainings2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShopTest {

	Product p1, p2, p3, p4, p5;
	Shop shop = new Shop();
	long priceLimit = 2000;

	@BeforeClass
	public void addProducts() {
		p1 = new Mobile("Redmi Note10", "MI", "White", 1500, true);
		p2 = new Mobile("Iphone11", "Apple", "Silver", 11500, true);
		p3 = new Television("Samsung Ultra QLED", "SAMSUNG", "Black", 45000, true);
		p4 = new Furnitures("SOFA", "COMPANY-A", "Dark Green", 2000, false);
		p5 = new Furnitures("Bed", "COMPANY-B", "Brown", 3000, false);

		shop.procureProducts(p1, p2, p3, p4, p5);

		Reporter.log("All products were procured for shop", true);
		Reporter.log("=================================EOT======================================", true);
	}

	@Test()
	public void getAllGstProducts() {	
		shop.showAllGstProducts();
		Reporter.log("All product available only with GST is displayed", true);
		Reporter.log("=================================EOT======================================", true);
	}

	@Test()
	public void getAllGstProductsWithinSomePriceRange() {
		shop.showAllGstProducts(priceLimit);
		Reporter.log("All product available withing price Range of '" + priceLimit + "' is displayed", true);
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void validateGstProducts() {
		Assert.assertTrue(shop.getAllGstProducts(priceLimit, shop.getAllGstProducts()).stream().parallel()
				.allMatch(product -> (shop.calculateGstAndGetTotalPrice(product) > 2000)));
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void validateGstProductsListCount() {
		Assert.assertEquals(shop.getAllGstProducts(priceLimit, shop.getAllGstProducts()).size(), 2);
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void validateProductAvailability() {
		String productName = "Bike";
		
		Assert.assertFalse(shop.isProductAvailable(productName));
		Reporter.log("The Product" + productName + "is not available in shop");
		Reporter.log("=================================EOT======================================", true);
	}
}
