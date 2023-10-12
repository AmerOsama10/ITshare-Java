package com.itshare.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.Coach;


public class SpringApp {

	public static void main(String[] args) {

		// load the spring configuration file	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("baseballCoach",Coach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for messages
		System.out.println(theCoach.getDailyMessage());



		// close the context
		context.close();
		
	}

}
