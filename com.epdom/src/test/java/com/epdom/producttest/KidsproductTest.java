package com.epdom.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsproductTest {
	@Test
	public void addProduct() {
		Reporter.log("add succesKids",true);
	}
	@Test
	public void updateProduct() {
		Reporter.log("updated success Kids",true);
	}
	@Test
	public void removeProduct() {
		Reporter.log("REMOVED succes Kids",true);
		
	}

}
