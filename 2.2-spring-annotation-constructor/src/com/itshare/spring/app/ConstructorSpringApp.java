package com.itshare.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.Coach;

// constructor injection

public class ConstructorSpringApp {
	public static void main(String[]args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		//call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getMessage());

		//close the context
		context.close();
	}
}
