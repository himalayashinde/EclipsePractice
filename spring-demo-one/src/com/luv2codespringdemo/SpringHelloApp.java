package com.luv2codespringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve a bean from spring container
		
		Coach TrackCoach= context.getBean("TrackCoach",Coach.class);
		
		Coach BaseBallCoach= context.getBean("BaseBallCoach",Coach.class);
		
		Coach HockeyCoach= context.getBean("HockeyCoach",Coach.class);
		
		// call methods on the bean
		//let's call our fortune service
		
		System.out.println(TrackCoach.getDailyWorkout());
		System.out.println(TrackCoach.getDailyFortune());
		
		System.out.println(BaseBallCoach.getDailyWorkout());
		System.out.println(BaseBallCoach.getDailyFortune());
	
		System.out.println(HockeyCoach.getDailyWorkout());
		System.out.println(HockeyCoach.getDailyFortune());
		
		
		//close the context
		
		context.close();
	}

}
