package com.tnsif.di;

public class Amazon {
	
	//Upi u=new Upi();//not a right approach
	
	Upi u;
	
	
	  //setter for DI 
	public void setU(Upi u) 
	{ this.u = u; }
	 
	
	/*
	 * //constructor public Amazon(Upi u) { super(); this.u = u;
	 * System.out.println("A Constructor"); }
	 */


	public void shopping()
	{
		u.makePayment();
	}

}
