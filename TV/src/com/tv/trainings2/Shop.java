package com.tv.trainings2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
	String shopName = "Home Appliances";
	double shopRating = 3.5;
	Address address;
	List<Products> products;

	Shop() {
		products = new ArrayList<>();
	}

	public void procureProducts(Products... products) {
		this.products.addAll(Arrays.asList(products));
	}

	public List<Products> getAllGstProducts() {
		ArrayList<Products> gstProducts = new ArrayList<>();

		for (Products product : products) {
			if (product.getProductGstStatus())
				gstProducts.add(product);
		}
		// System.out.println(gstProducts);
		return gstProducts;
	}

	public List<Products> getNonGstProducts() {
		ArrayList<Products> nongGtProducts = new ArrayList<>();

		for (Products product : products) {
			if (!product.getProductGstStatus())
				nongGtProducts.add(product);
		}
		return nongGtProducts;
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
