package com.coxgs.springdemo;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Skate around the rink 5 times backward.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
