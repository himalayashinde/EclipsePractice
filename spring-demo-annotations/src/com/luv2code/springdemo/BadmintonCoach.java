package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("ThatBadmintonCoach")
public class BadmintonCoach implements Coach {

	@Override
	public String getdailyWorkOut() {
		
		return "Practice The Samsh To Perfection";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
