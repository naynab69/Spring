package com.tnsif.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Amazon amazon=c.getBean("amazon",Amazon.class);
		amazon.disp();
		
		Amazon amazon1=c.getBean("amazon1",Amazon.class);
		amazon1.disp();
	
	}
	

}
