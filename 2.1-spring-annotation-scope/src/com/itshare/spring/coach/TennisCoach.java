
package com.itshare.spring.coach;

//constructor injection
//scope of the bean [ singleton - prototype]
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.itshare.spring.message.MessageService;


@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	private MessageService message;

	public TennisCoach() {
		System.err.println("TennisCoach - no args constructor ");
	}

	public TennisCoach(MessageService message) {
		System.err.println("TennisCoach - with MessageService constructor ");
		this.message = message;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice your backhand volly";
	}

	@Override
	public String getMessage() {

		return message.getMessage();
	}

}
