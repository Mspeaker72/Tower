package org.example.InventoryRelated;

import org.example.CharacterRelated.Player;

public class empty implements Item{

    public empty(){

    }
    @Override
    public int getQuantity() {
        return 0;
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
        return null;
    }
}
