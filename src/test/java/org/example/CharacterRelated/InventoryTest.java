package org.example.CharacterRelated;

import org.example.InventoryRelated.Potion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    Potion potion = new Potion(3);

    Potion potionTwo = new Potion(2);

    Inventory inventory;

    @BeforeEach
    void setup(){
        inventory = new Inventory();
    }


    @Test
    void addItemSingle() {
        inventory.addItem(potion);
        assertEquals(inventory.getInventory().size(),1);
    }

    @Test
    void addItemDouble() {
        inventory.addItem(potion);
        inventory.addItem(potionTwo);
        assertEquals(inventory.getInventory().size(),2);
    }

    @Test
    void UseItem() {
        inventory.addItem(potion);
        inventory.useItem(potion);
        assertEquals(inventory.getInventory().size(),0);
    }

    @Test
    void RemoveCorrectItem() {
        inventory.addItem(potion);
        inventory.addItem(potionTwo);
        inventory.useItem(potion);
        assertEquals(inventory.getInventory().size(),1);
    }
}