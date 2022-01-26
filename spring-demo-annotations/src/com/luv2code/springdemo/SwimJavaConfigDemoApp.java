package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring Java Class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext (SportConfig.class);
		
		//get the bean for spring Container
		SwimCoach theCoach= context.getBean("swimCoach",SwimCoach.class);
//		Coach TheBadmintonCoach = context.getBean("ThatBadmintonCoach",Coach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getdailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		//		System.out.println(TheBadmintonCoach.getdailyWorkOut());
		 
		//Call our new swim Coach methods
		System.out.println("email : "+ theCoach.getEmail());
		System.out.println("team : "+ theCoach.getTeam());
		
		//close the context
		context.close();
		
	}

}
