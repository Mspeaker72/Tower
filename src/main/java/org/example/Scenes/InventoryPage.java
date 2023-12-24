package org.example.Scenes;

import org.example.CharacterRelated.Player;
import org.example.InventoryRelated.Item;

public class InventoryPage implements ConsolePages {


    Player player ;

    public InventoryPage(Player user){
        this.player = user;
    }


    public  void displayPage(){

        System.out.println("Item   : Quantity");

        for(Item item: player.getInventory().getInventory().keySet()){

            System.out.println(item.DisplayString()+" : "+item.getQuantity());
        }

    }

}
