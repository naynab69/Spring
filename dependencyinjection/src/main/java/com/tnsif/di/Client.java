package com.tnsif.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Amazon amazon=c.getBean("amazon",Amazon.class);
		amazon.shopping();
		
		Myntra myntra=c.getBean("myntra",Myntra.class);
		myntra.startShopping();
	}

}
