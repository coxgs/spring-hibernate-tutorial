package com.coxgs.springdemo;

public class CurlingCoach implements Coach {
	
	FortuneService fortuneService;
	
	public CurlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Scrape the ice for 1000 meters.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
