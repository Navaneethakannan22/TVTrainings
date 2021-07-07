package com.tv.trainings2;

public class Products {
String name;
String brand;
String color;
long price;
boolean isGstApplicable;

Products(String name,String brand,String color,int price,boolean isGstApplicable){
	this.name=name;
	this.brand=brand;
	this.color=color;
	this.price=price;
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

public long getPrice() {
	return price;
}
public boolean getProductGstStatus() {
	return isGstApplicable;
}
}
