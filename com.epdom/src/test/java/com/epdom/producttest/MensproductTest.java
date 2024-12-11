package com.epdom.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MensproductTest {
	@Test
	public void addProduct() {
		Reporter.log("add succes mens",true);
	}
	@Test
	public void updateProduct() {
		Reporter.log("updated success mens",true);
	}
	@Test
	public void removeProduct() {
		Reporter.log("REMOVED succes mens",true);
		
	}

}
