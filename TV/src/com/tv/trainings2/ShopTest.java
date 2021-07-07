package com.tv.trainings2;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShopTest {

	Products p1, p2, p3, p4, p5;
	Shop shop = new Shop();
	Products product = new Products();
	List<Products> gstProducts = new ArrayList<>();

	@Test
	public void addProducts() {
		p1 = new Mobile("Redmi Note 10", "MI", "White", 1500, true);
		p2 = new Mobile("Iphone 11", "Apple", "Silver", 11500, true);
		p3 = new Television("Samsung Ultra QLED", "SAMSUNG", "Black", 45000, true);
		p4 = new Furnitures("SOFA", "COMPANY-A", "Dark Green", 2000, false);
		p5 = new Furnitures("Bed", "COMPANY-B", "Brown", 3000, false);

		shop.procureProducts(p1, p2, p3, p4, p5);

		Reporter.log("All products were procured for shop", true);
	}

	@Test()
	public void getAllGstProducts() {
		List<Products> allGstProducts = shop.getAllGstProducts();

		for (Products gstProduct : allGstProducts) {
			// System.out.println(priceWithGst);
			if (shop.getPriceWithGst(gstProduct) > 2000)
				gstProducts.add(gstProduct);
		}
		Reporter.log("All product whose price is more than Rs.2000(GST Included) is: " + gstProducts.toString(), true);
	}

	@Test
	public void validateGstProducts() {
		Assert.assertTrue(
				gstProducts.stream().parallel().allMatch(product -> (shop.getPriceWithGst(product) > 2000)));
	}

	@Test
	public void validateGstProductsListCount() {
		Assert.assertEquals(gstProducts.size(), 2);
		Reporter.log("=======================================================================",true);
	}
}
