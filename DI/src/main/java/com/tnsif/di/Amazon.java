package com.tnsif.di;

public class Amazon {
	
	private String userName;
	private int id;
	
	
	
	
	public Amazon(String userName, int id) {
		super();
		this.userName = userName;
		this.id = id;
	}




	/*
	 * public void setId(int id) { this.id = id; }
	 * 
	 * 
	 * 
	 * public void setUserName(String userName) { this.userName = userName; }
	 */

	void disp()
	{
		System.out.println(userName+" "+id);
	}
	

}
