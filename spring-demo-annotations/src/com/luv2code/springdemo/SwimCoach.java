package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	@Override
	public String getdailyWorkOut() {
		
		return "Swim 1000 mtrs as a warm up routine";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune() ;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

	
	
}
