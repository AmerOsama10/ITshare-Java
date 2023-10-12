package com.itshare.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.Coach;

public class beanLifeCycleSpringApp {
	public static void main(String[] args) {
		
		// load the spring configuration file	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach =  context.getBean("trackCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
	}
}
