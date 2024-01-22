package org.example.Tower;

import org.example.CharacterRelated.Player;

import java.util.Random;

public class Floor implements Floors {

    private Player player;
    private int currentFloor;

    private Random random = new Random();

    private int currentStep;

    private TowerEvents towerEvents;

    private final int floorLength = 10;

    private final  int floorStart = 0;


    public Floor(Player player){
        this.currentFloor = 1;
        this.currentStep= 0;
        this.towerEvents = new TowerEvents();
        this.player = player;
    }

    public Floor(){
        this.currentFloor = 1;
        this.currentStep= 0;
        this.towerEvents = new TowerEvents();
        this.player = null;
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
        return this.towerEvents;
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
        if(!isBossFloor()) {
            triggerEvent();


        }else {
            triggerBossBattle();
        }

        // player can move floors once event resolves
        if(currentStep==10){
            next();
        }
    }

    @Override
    public void next() {
        currentFloor++;
        this.currentStep=0;
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
    private void triggerEvent(){
        if(currentStep%2==0 && currentStep!=0){
            System.out.println("Event triggering");
            System.out.println();
            this.player =this.towerEvents.
                    occurrence(random.nextInt(3),player,this);
        }
    }

    private void triggerBossBattle(){
        System.out.println("Boss fight");
    }

    public Player getPlayerState() {
        return player;
    }
}
