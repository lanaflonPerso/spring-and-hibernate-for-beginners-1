package com.stanchenko;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: Private constructor is called");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: setFortuneService is called");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
