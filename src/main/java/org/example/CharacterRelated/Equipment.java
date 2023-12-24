package org.example.CharacterRelated;

import org.example.InventoryRelated.Item;

import java.util.HashMap;

public class Equipment {

    private HashMap<String, Item> equipment;


    private void initialize(){
        equipment.put("Head",null);
        equipment.put("Torso",null);
        equipment.put("Hands",null);
        equipment.put("Legs",null);
        equipment.put("Weapon",null);

    }

    public Equipment(){
        initialize();
        this.equipment= new HashMap<>();
    }

    public void equip(String bodyElement,Item item){
        equipment.replace(bodyElement,item);

    }

    public void unequip(String bodyElement,Item item){
        equipment.replace(bodyElement,null);
    }


        public HashMap<String, Item> getEquipment() {
        return equipment;
    }
}
