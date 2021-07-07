package com.tv.trainings2;

public class Products {
String name;
String brand;
String color;
long basePrice;
boolean isGstApplicable;

Products(){}
Products(String name,String brand,String color,int basePrice,boolean isGstApplicable){
	this.name=name;
	this.brand=brand;
	this.color=color;
	this.basePrice=basePrice;
	this.isGstApplicable=isGstApplicable;
}

public String getName() {
	return name;
}

public String getBrand() {
	return brand;
}

public String getspecifications() {
	return color;
}

public long getBasePrice() {
	return basePrice;
}
public boolean getProductGstStatus() {
	return isGstApplicable;
}
public long getPriceWithGst(Products product) {
	long gstPrice= (product.getBasePrice()*18)/100;
	return product.getBasePrice()+gstPrice;
}

@Override
public String toString() {
	return getName();
}
}
