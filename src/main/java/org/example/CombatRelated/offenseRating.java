package org.example.CombatRelated;

public class offenseRating {

    private int offensivePower;

    public offenseRating(){
        this.offensivePower= 12;
        //will change once inventory is introduced
    }

    public int getOffensivePower() {
        return offensivePower;
    }

    public offenseRating updateOffensivePower(int offensivePower) {
        this.offensivePower = offensivePower;
        return this;
    }
}
