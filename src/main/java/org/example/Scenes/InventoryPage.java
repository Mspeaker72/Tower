package org.example.Scenes;

import org.example.CharacterRelated.Player;
import org.example.InventoryRelated.Item;
import org.example.InventoryRelated.Potion;
import org.example.InventoryRelated.Weapon;
import org.example.Menus.Menu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryPage implements ConsolePages {


    private Player player ;

    private Menu menu;

    private final String[] column ={"Item","Quantity"};

    private List<String[]> inventoryList = new ArrayList<>();




    public InventoryPage(Player user){
        this.player = user;
        this.menu = new Menu("Inventory");
    }


    public  void displayPage(){

        for(Item item: player.getInventory().getInventory().keySet()){
            inventoryList.add(new String[] {item.DisplayString(), String.valueOf(item.getQuantity())});
        }
        String[][] inventoryArray = new String[inventoryList.size()][];
        for (int i = 0; i < inventoryList.size(); i++) {
            inventoryArray[i] = inventoryList.get(i);
            // create new list that is exactly the size of elements within hashmap
        }

        menu.table(column, inventoryArray);


    }

    @Override
    public void updateState(Player player) {

    }

}
