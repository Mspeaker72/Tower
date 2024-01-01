package org.example.InventoryRelated;

import org.example.CharacterRelated.Player;

public class Potion implements Item{

    private int quantity;

    private final int strength = 25;

    private String name;

    public Potion(){
        this.quantity=1;
        this.name = "Potion";
    }

    public int getStrength() {
        return strength;
    }

    public Potion(int amount){
        this.quantity=amount;
        this.name = "Potion";
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void UseItem(Player player) {
       player.getStats().getHp().Heal(this);

    }

    @Override
    public void acquire(int amount) {
        this.quantity+=amount;
    }

    @Override
    public String DisplayString() {
        return name;
    }
}
