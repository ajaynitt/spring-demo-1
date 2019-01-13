package com.love2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "TrackCode : Run 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getfortune();
	}

}
