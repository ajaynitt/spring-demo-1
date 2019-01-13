package com.love2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	 public CricketCoach() {
		
	}
	 
	 
	 //our setter method
	 //this is being called from property name="fortuneService" in xml file
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "CricketCoach : Bat for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getfortune();
	}

	
}
