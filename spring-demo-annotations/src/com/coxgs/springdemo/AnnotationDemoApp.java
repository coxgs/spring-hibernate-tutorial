package com.coxgs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// call method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		
		// get the bean from spring container
		Coach bowlingCoach = context.getBean("bowlingCoach", Coach.class);
		
		// call method on the bean
		System.out.println(bowlingCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
