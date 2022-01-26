package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//get the bean for spring Container
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
//		Coach TheBadmintonCoach = context.getBean("ThatBadmintonCoach",Coach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getdailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		//		System.out.println(TheBadmintonCoach.getdailyWorkOut());
		//close the context
		context.close();
		
	}

}
