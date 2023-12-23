package org.example.Scenes;

import org.example.CharacterRelated.Player;

public class StatusPage {

    Player player ;

    public StatusPage(Player user){
        this.player = user;
    }


    public  void displayPage(){

        System.out.println("Gender: "+ player.getgender().DisplayGender());
        System.out.println("HP: "+ player.getStats().getHp().getHp()+"/"+ player.getStats().getHp().getMaxHp());
        System.out.println("ATK: "+player.getStats().getAttack().getOffensivePower() );
        System.out.println("DEF: "+player.getStats().getDefence().getDefensePower());

    }
}

