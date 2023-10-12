package com.itshare.spring.app;

import com.itshare.spring.coach.BaseballCoach;
import com.itshare.spring.coach.Coach;

// just normal way without spring
// tightly coupled

public class NoSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create the object
		Coach theCoach = new BaseballCoach();
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for messages
		System.out.println(theCoach.getDailyMessage());
	}

}
