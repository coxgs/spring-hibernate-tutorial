package com.coxgs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(alphaCoach.getDailyWorkout());
		
		// check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();
	}

}
