package com.tv.trainings2;

import org.testng.annotations.Test;

public class ShopTest {

	Products  p1,p2,p3,p4,p5;
	
	@Test
	public void addProducts() {
		p1=new Mobile("Redmi Note 10", "MI", "White", 15000, true);
		p2=new Mobile("Iphone 11", "Apple", "Silver", 115000, true);
		p3=new Television("Samsung Ultra QLED", "SAMSUNG", "Black", 45000, true);
		p4=new Furnitures("SOFA", "COMPANY-A", "Dark Green", 20000, false);
		p5=new Furnitures("Bed", "COMPANY-B", "Brown", 30000, false);
	}
}
