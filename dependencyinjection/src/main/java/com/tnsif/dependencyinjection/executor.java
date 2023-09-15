package com.tnsif.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class executor {

	public static void main(String[] args) {

		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");  //loose coupling
		
		System.out.println("Configuration file is loaded");
		Student s1=c.getBean("student",Student.class);
		s1.print();
		
		Student s2=c.getBean("student2",Student.class);
		s2.print();
		
	}

}
