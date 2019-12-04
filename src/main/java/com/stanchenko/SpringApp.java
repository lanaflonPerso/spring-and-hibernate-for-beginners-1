package com.stanchenko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        TennisCoach myCoach = applicationContext.getBean("tennisCoach", TennisCoach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getEmail());

        // close the context
        applicationContext.close();
    }
}
