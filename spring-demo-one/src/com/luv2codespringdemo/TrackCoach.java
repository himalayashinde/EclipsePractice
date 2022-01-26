package com.luv2codespringdemo;

public class TrackCoach implements Coach {

		private FortuneService fortuneService;
		
	public TrackCoach(){}
		
	public TrackCoach(FortuneService fortuneService) {
			super();
			this.fortuneService = fortuneService;
		}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run A Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do it: "+fortuneService.getFortune();
	}

	
	//add an init Method 
	
	public void doMyStartUpStuff() {
	
		System.out.println("TrackCoach : Init Method doMyStartUpStuff");
	}
	
	//add an destroy method
	public void doMyCleanUpStuffYoYo() {
		System.out.println("TrackCoach : Destroy Method doMyCleanUpStuffYoYo");
	}
}
