package com.coxgs.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"You will have a great day!",
			"You will have a bad day!",
			"Your day will be okay fine!"
	};

	@Override
	public String getFortune() {
		Random r  = new Random();
		int index = r.ints(0, 3).findFirst().getAsInt();
		return fortunes[index];
	}

}
