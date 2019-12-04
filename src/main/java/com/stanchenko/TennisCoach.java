package com.stanchenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${sports.email}")
    private String email;

    public String getEmail() {
        return email;
    }

    @Autowired
    public void setFortuneService(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Hit ball 5 times";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
