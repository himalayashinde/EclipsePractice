package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config files
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve the bean from the spring container 
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach= context.getBean("tennisCoach",Coach.class);
		
		//check if they are same
		
		boolean result= (theCoach == alphaCoach);
		
		//printout the results 
		System.out.println("\n pointing to the same object :-" + result);
		
		System.out.println("\n MemoryLocation for the theCoach :- "+ theCoach);
		
		System.out.println("\n MemoryLocation for the alphaCoach :- "+ alphaCoach +"\n");

		//close the context
		context.close();
		

	}

}
