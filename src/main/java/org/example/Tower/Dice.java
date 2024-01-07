package org.example.Tower;

import java.util.Random;

public class Dice {

    private final Random random = new Random();

    private final int[] roll = {-2,-1,0,1,2};

    public Dice(){

    }

    public int rollDice(){
        return roll[random.nextInt(4)];
    }



}
