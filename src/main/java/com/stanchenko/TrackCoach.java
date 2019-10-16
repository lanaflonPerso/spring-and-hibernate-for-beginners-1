package com.stanchenko;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5 kilometers";
    }

    public String getDailyFortune() {
        return "Be faster today. " + fortuneService.getFortune();
    }
}
