package org.example.Tower;

import org.example.Admin.LoggingTower;

import java.time.LocalDateTime;
import java.util.Random;

public class Dice {

    private int currentResult;

    private final Random random = new Random();

    private final int[] roll = {-2,-1,0,1,2};

    public Dice(){

    }

    public int rollDice(){
        currentResult= roll[random.nextInt(4)];
        LoggingTower.processRollLog(LocalDateTime.now()+" : the current roll is "+currentResult);
        return currentResult;
    }



}
