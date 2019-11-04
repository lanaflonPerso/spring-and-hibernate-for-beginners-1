package com.stanchenko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApplication {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScopes-applicationContext.xml");

        // retrieve bean from spring container
        Coach myCoach = applicationContext.getBean("myCoach", Coach.class);

        Coach alphaCoach = applicationContext.getBean("myCoach", Coach.class);

        boolean beansAreSame = myCoach == alphaCoach;

        System.out.println("Pointing to the same object: " + beansAreSame);

        System.out.println("Memory location for myCoach: " + myCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        // close the context
        applicationContext.close();
    }
}
