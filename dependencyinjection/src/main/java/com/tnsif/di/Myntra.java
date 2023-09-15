package com.tnsif.di;

public class Myntra {
	
	Upi u;
	

	
	  //setter for DI 
	public void setU(Upi u) 
	{ this.u = u; }
	 
	
	/*
	 * //constructor public Myntra(Upi u) { super(); this.u = u;
	 * System.out.println("M Constructor"); }
	 * 
	 * 
	 */

	public void startShopping()
	{
		u.makePayment();
	}



}
