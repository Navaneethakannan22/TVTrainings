package com.tv.trainings2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	String shopName = "Home Appliances";
	double shopRating = 3.5;
	Address address;
	List<Products> products;
	// List<Products> nonGstProducts;

	Shop() {
		products = new ArrayList<>();
		// nonGstProducts=new ArrayList<>();
	}

	public void procureProducts(Products... products) {
		for (Products product : products) {
			this.products.add(product);
		}

	}

	public List<Products> getAllGstProducts() {
		Shop shop = new Shop();
		for (Products product : products) {
			if (product.getProductGstStatus())
				shop.procureProducts(product);
		}
		return products;
	}

	public List<Products> getNonGstProducts() {
		Shop shop = new Shop();
		for (Products product : products) {
			if (!product.getProductGstStatus())
				shop.procureProducts(product);
		}
		return products;
	}

	public String getShopAddress() {
		return address.getDoorNo() + " " + address.getStreetName() + " " + address.getPlace();
	}

	public double getShopRatings() {
		return shopRating;
	}

	public boolean isProductAvailable(String productName) {
		boolean isProductAvail = false;
		for (Products product : products) {
			if (product.getName().equalsIgnoreCase(productName))
				isProductAvail = true;
		}
		return isProductAvail;
	}
}
