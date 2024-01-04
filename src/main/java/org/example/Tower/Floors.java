package org.example.Tower;

public interface Floors {

    /*
     -each tenth floor has a boss monster
     -each floor has 10 steps before it is clear except boss stages
     -when a stage is cleared you go a floor up
     - every step divisible by two causes an event except the boss rooms
     */

    public boolean isBossFloor();

    public boolean clear();

    public Encounter getEvent();

    public int getCurrentFloor();

    public int getCurrentStep();


    void next();
}
