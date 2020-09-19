package com.coxgs.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice picking up the spares.";
	}

}
