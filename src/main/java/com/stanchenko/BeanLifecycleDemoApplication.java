package com.stanchenko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApplication {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach myCoach = applicationContext.getBean("myCoach", Coach.class);

        // close the context
        applicationContext.close();
    }
}
