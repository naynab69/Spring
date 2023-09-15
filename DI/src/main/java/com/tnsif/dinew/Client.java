package com.tnsif.dinew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	
	Amazon amazon=c.getBean("amazon",Amazon.class);
	amazon.shopping();
	
	Flipkart flipkart=c.getBean("flipkart",Flipkart.class);
	flipkart.startShopping();

	}

}
