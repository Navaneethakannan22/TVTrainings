package com.tv.trainings2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
	String shopName = "Home Appliances";
	double shopRating = 3.5;
	Address address;
	List<Product> products;

	Shop() {
		products = new ArrayList<>();
	}

	// To add products to shop
	public void procureProducts(Product... products) {
		this.products.addAll(Arrays.asList(products));
	}

	// To get all GST Eligible Products
	public ArrayList<Product> getAllGstProducts() {
		ArrayList<Product> gstProducts = new ArrayList<>();

		for (Product product : products) {
			if (product.isProductElibleForGst())
				gstProducts.add(product);
		}
		return gstProducts;
	}

	// To get all GST Un-Eligible Products
	public ArrayList<Product> getAllNonGstProducts() {
		ArrayList<Product> nongGtProducts = new ArrayList<>();

		for (Product product : products) {
			if (!product.isProductElibleForGst())
				nongGtProducts.add(product);
		}
		return nongGtProducts;
	}

	// To display all products in shop
	public void showAllProducts() {
		products.toString();
	}

	// To display all GST eligible products in shop
	public void showAllGstProducts() {
		System.out.println(getAllGstProducts().toString());
	}

	// To display all GST eligible products within expected price Range
	public void showAllGstProducts(long expectedPrice) {
		ArrayList<Product> gstProduct = getAllGstProducts();
		System.out.println(getAllGstProducts(expectedPrice, gstProduct).toString());
	}

	// To get all GST Products within some price range
	public List<Product> getAllGstProducts(long expectedPrice, ArrayList<Product> gstProduct) {
		return gstProduct.stream().parallel().filter(product -> calculateGstAndGetTotalPrice(product) > expectedPrice)
				.collect(Collectors.toList());
	}

	// To calculate GST
	public long calculateGstAndGetTotalPrice(Product product) {
		long gstAmount = (product.getBasePrice() * product.getProductGstPercenatge()) / 100;
		return product.getBasePrice() + gstAmount;
	}

	// To display shop Address
	public String getShopAddress() {
		return address.getDoorNo() + " " + address.getStreetName() + " " + address.getLocation();
	}

	// To display shop Ratings
	public double getShopRatings() {
		return shopRating;
	}

	// To display particular product is available in shop or not
	public boolean isProductAvailable(String productName) {
		boolean isProductAvail = false;

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(productName))
				isProductAvail = true;
		}
		return isProductAvail;
	}

}
