package org.example.InventoryRelated;

import org.example.CharacterRelated.Player;

public class Weapon implements Item{

    private int quantity;

    private int strength;

    private String name;

    public Weapon(String name,int strength){
        this.name =name;
        this.strength = strength;
        quantity= 1;

    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void UseItem(Player player) {

    }

    @Override
    public void acquire(int amount) {

    }

    @Override
    public String DisplayString() {
        return this.name;
    }
}
