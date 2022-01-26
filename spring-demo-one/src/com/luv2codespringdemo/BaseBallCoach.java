package com.luv2codespringdemo;

public class BaseBallCoach implements Coach{
	
	//define a private field for the dependency
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(){};
	
	// define a constructor for Dependency injection
	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override 
	public String getDailyWorkout() {
		
		return "spend 30 min in batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune 
		return fortuneService.getFortune();
	}
	

}
