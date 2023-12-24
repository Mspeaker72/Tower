package org.example.CharacterRelated;

import org.example.CharacterRelated.Character;
import org.example.CharacterRelated.Gender;

public class Player implements Character {

    private final Gender playerGender;

    private Stats stats;

    private Inventory inventory;

    private Equipment equipment;


    public Player(Gender gender ,Stats stats){
        this.playerGender = gender;
        this.stats = stats;
        this.inventory = new Inventory();
        this.equipment = new Equipment();
    }
    @Override
    public Gender getgender() {
        return this.playerGender;
    }

    @Override
    public Stats getStats() {
        return this.stats;
    }

    @Override
    public Inventory getInventory() {
        return this.inventory;
    }

    @Override
    public Equipment getEquipment() {
        return this.equipment;
    }
}
