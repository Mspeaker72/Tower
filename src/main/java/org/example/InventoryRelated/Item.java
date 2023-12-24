package org.example.InventoryRelated;

import org.example.CharacterRelated.Player;

public interface Item {


    public int getQuantity();


    public String getDescription();

    public void UseItem(Player player);

    public void acquire(int amount);


    public String DisplayString();



}
