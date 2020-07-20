package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportTester {
	public static void main(String[] args) {
		String contextXml="resource/spring.xml";
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(contextXml);
		Airport airport=applicationContext.getBean(Airport.class);
		
		
	}
}
