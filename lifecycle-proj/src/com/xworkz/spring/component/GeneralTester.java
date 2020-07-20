package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GeneralTester {
	public static void main(String[] args) {
		String context="resource/spring.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(context);
	
		Camera sony=applicationContext.getBean(Camera.class);
	
		Stadium chinnaswamy=applicationContext.getBean(Stadium.class);
		
		String string=applicationContext.getBean(String.class);
		System.out.println("refOfString"+string);
		
		Integer integer=applicationContext.getBean(Integer.class);
		System.out.println("refOfString"+integer);
		
	}

}
