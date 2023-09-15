package com.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");  //loose coupling
		
		System.out.println("Configuration file is loaded");
				
		  Sim sim=c.getBean("sim",Sim.class);
		  sim.calling();
		  sim.browsing();
		  
		 
		 
	

	}

}
