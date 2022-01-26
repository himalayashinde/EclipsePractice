package com.luv2codespringdemo;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(){};
	
	public HockeyCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Your need to run 10k per day to uplift the stamina...!!!";
	}

	@Override
	public String getDailyFortune() {
		
		return " Hockey is your passion and you are born for it...!!!" + fortuneService.getFortune();
	}

}
