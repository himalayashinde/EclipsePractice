package com.luv2codespringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		//retrieve the beam from the container
		Coach theCoach= context.getBean("TrackCoach",Coach.class);
		Coach alphaCoach= context.getBean("TrackCoach",Coach.class);
		
		// check if these are the same beans
		
		boolean result= (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object := " + result);
		
		System.out.println("\nMemory location for theCoach := " + theCoach);
		System.out.println("\nMemory location for alphaCoach := " + alphaCoach +"\n");
		
		//Close the context
		context.close();
	}

}
