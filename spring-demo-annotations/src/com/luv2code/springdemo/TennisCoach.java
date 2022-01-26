package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component/*("thatSillyCoach")*/
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	// define a default constructor
	
	public TennisCoach() {
		
		System.out.println("TennisCoach:- Inside Defalut Constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
	System.out.println(">> TennisCoach: Inside Of doMyStartupStuff ");	
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		
		System.out.println(">> TennisCoach: Inside Of doMyCleanupStuff ");
	}
	
	// Define a setter method
/*	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("Inside setFortuneService method()");
		fortuneService= theFortuneService;
	}	
*/	

/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService)
	{
		System.out.println("Inside doSomeCrazyStuffs method()");
		fortuneService= theFortuneService;
	}
	*/
	
/*	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
*/	 
	
	@Override
	public String getdailyWorkOut() {
		
		return "Practice your Backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
