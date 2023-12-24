package org.example.CharacterRelated;

import org.example.InventoryRelated.Item;
import org.example.InventoryRelated.Potion;

import java.util.HashMap;

public class Inventory {

    private HashMap<Item,Integer> inventory;


    public Inventory(){
        this.inventory = new HashMap<>();
    }

    public void addItem(Item item){
        inventory.put(item,item.getQuantity());
    }

    public HashMap<Item, Integer> getInventory() {
        return inventory;
    }
}
