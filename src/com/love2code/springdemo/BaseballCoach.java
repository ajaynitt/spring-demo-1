package com.love2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "30 mints practice";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getfortune();
	}
	
	

}
