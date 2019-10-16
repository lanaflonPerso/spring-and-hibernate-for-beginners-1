package com.stanchenko;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Jump 50 times";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
