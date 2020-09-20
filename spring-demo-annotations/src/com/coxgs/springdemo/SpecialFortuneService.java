package com.coxgs.springdemo;

public class SpecialFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are special just like everyone else.";
	}

}
