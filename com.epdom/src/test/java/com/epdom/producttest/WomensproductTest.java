package com.epdom.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WomensproductTest {
	@Test
	public void addProduct() {
		Reporter.log("add succes-womens",true);
	}
	@Test
	public void updateProduct() {
		Reporter.log("updated success womens",true);
	}
	@Test
	public void removeProduct() {
		Reporter.log("REMOVED succes womens",true);
		
	}

}
