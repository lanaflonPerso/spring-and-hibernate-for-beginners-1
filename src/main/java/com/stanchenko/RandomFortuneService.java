package com.stanchenko;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes = new String[]{"Good luck!", "Be Strong!", "Just do it!"};
    private Random random = new Random();

    public String getFortune() {
        int fortuneIndex = random.nextInt(fortunes.length);
        return fortunes[fortuneIndex];
    }
}
