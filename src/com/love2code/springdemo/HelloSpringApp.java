package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		
		
		//cricket coach with setter injection
		Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

	System.out.println(cricketCoach.getDailyWorkout());
		
		//close context
		context.close();
		
		

	}

}
