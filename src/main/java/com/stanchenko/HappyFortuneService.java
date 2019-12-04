package com.stanchenko;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Good luck!";
    }
}
