package com.tnsif.dinew;

public class Flipkart {

	Gpay g;
	
	public void setG(Gpay g) {
		this.g = g;
	}

	public void startShopping()
	{
		g.makePayment();
	}
	
}
