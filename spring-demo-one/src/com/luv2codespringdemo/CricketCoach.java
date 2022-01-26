package com.luv2codespringdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new feilds for email address and team
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside Setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside Setter method - setTeam");
		this.team = team;
	}

	
	
	
	
	//Create a no-args constructor
	public CricketCoach(){
		System.out.println("Cricket Coach: inside no-args constructor");
	}
	
	// our setter method 	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
	
		return "Practice fast bowling for 15 min Everyday";
	}

	@Override
	public String getDailyFortune() {
	
		return "Cricket Coach says " +fortuneService.getFortune();
	}

}
