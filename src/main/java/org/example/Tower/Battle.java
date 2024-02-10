package org.example.Tower;

import org.example.CharacterRelated.Player;
import org.example.InventoryRelated.Potion;

public class Battle {
    private Player user;

    private final Potion potion = new Potion(1);
    // will implement a drop table;

    public void battling(Player user,Floor floor){
        if(floor.getCurrentStep()%4==0) {
            user.getStats().getHp().
                    TakeDamage(floor.getCurrentFloor());
            System.out.println("you lose");

        }else {
            user.getInventory().addItem(potion);
            System.out.println("you win");
        }
        this.user = user;
    }

    public Player result(){
        return user;
    }



}
