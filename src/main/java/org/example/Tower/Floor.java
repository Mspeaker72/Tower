package org.example.Tower;

public class Floor implements Floors {

    private int currentFloor;

    private int currentStep;

    private final int floorLength = 10;

    private final  int floorStart = 0;


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
    public void update() {
        System.out.println("you are currently on step "
                +currentStep+" " +
                "of the "+currentFloor+" floor.");
    }

    @Override
    public void next() {
        currentFloor++;
    }

    public void step(int roll) {
        int result = currentStep+roll;

        if(result>=floorLength){
            currentStep= floorLength;
        } else if (result<=floorStart) {
            currentStep=floorStart;
        } else {
            currentStep=result;
        }


    }


}
