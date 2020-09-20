package com.coxgs.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDempApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// get the bean from spring container
		Coach bowlingCoach = context.getBean("bowlingCoach", Coach.class);
		
		// call method on the bean
		System.out.println(bowlingCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
