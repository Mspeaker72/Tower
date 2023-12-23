package org.example.CharacterRelated;

import org.example.CharacterRelated.Character;
import org.example.CharacterRelated.Gender;

public class Player implements Character {

    private final Gender playerGender;

    private Stats stats;


    public Player(Gender gender ,Stats stats){
        this.playerGender = gender;
        this.stats = stats;
    }
    @Override
    public Gender getgender() {
        return this.playerGender;
    }

    @Override
    public Stats getStats() {
        return stats;
    }
}
