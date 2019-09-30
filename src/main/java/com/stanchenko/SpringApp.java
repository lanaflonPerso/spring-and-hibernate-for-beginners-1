package com.stanchenko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach myCoach = applicationContext.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        applicationContext.close();
    }
}
