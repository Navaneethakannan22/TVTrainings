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

@Override
public String toString() {
	return getName();
}
}
