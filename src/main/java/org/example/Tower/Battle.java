package org.example.Tower;

import org.example.CharacterRelated.Player;

public class Battle {
    private Player user;




    public void battling(Player user,Floor floor){
        if(floor.getCurrentStep()%4==0) {
            user.getStats().getHp().TakeDamage(floor.getCurrentFloor());
            System.out.println("you lose");

        }else {
            System.out.println("you win");
        }
        this.user = user;
    }

    public Player result(){
        return user;
    }



}
