package com.stanchenko;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Throw ball 20 times";
    }

    public String getDailyFortune() {
        return "Good day! " + fortuneService.getFortune();
    }
}
