package com.luv2codespringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve the beam from the container
		Coach theCoach= context.getBean("TrackCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		 
		//Close the context
		context.close();
	}

}
