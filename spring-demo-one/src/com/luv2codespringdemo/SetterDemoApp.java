package com.luv2codespringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//retrieve a bean from spring container
			CricketCoach cricketCoach= 
					context.getBean("CricketCoach",CricketCoach.class);	
		
				
				// call methods on the bean
			
				System.out.println(cricketCoach.getDailyWorkout());
				System.out.println(cricketCoach.getDailyFortune()); 
	
				// call our new methods to get the literal values
				System.out.println(cricketCoach.getEmailAddress());
				System.out.println(cricketCoach.getTeam());
				
				//close the context
				
				context.close();
		 

	}

}
