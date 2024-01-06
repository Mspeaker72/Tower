package org.example.Tower;

public class Floor implements Floors {

    private int currentFloor;

    private int currentStep;

    private final int floorLength = 10;


    public Floor(){
        this.currentFloor = 1;
        this.currentStep= 0;
    }

    @Override
    public boolean isBossFloor() {
        return currentFloor%10==0;
    }

    @Override
    public boolean clear() {
        return currentStep==floorLength;
    }

    @Override
    public Encounter getEvent() {
        return null;
    }

    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public int getCurrentStep() {
        return currentStep;
    }

    @Override
    public void next() {
        currentFloor++;
    }

    public void step(int roll) {
        currentStep+=roll;
    }


}
