package org.example.CombatRelated;

public class playerLevel {

    private int currentLevel;

    public playerLevel(){
        this.currentLevel=1;
    }

    public void levelup(){
        currentLevel+=1;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
