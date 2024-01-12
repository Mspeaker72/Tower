package org.example.Scenes;

import org.example.CharacterRelated.Player;
import org.example.Menus.Menu;

import javax.swing.*;

public class StatusPage implements ConsolePages {

    Player player ;
    Menu menu;

    JTextField gender = new JTextField();
    JTextField Hp = new JTextField();

    JTextField Atk= new JTextField();

    JTextField Def = new JTextField();

    JTextField name = new JTextField();

    public StatusPage(Player user){
        this.player = user;
        String page = "Status Page";
        this.menu = new Menu(page);
        populateFrame();
    }

    private void populateFrame(){
        menu.addTextElement(name,"Name: "+ player.name(),130,40,100,40);
        menu.addTextElement(gender,"Gender: "+ player.getgender().DisplayGender(),130,100,100,40);
        menu.addTextElement(Hp,"HP: "+ player.getStats().getHp().getHp()+"/"+ player.getStats().getHp().getMaxHp(),130,160,100,40);
        menu.addTextElement(Atk,"ATK: "+player.getStats().getAttack().getOffensivePower(),130,220,100,40);
        menu.addTextElement(Def,"DEF: "+player.getStats().getDefence().getDefensePower(),130,280,100,40);

    }


    public  void displayPage(){

        menu.setProperties();


//        System.out.println("Gender: "+ player.getgender().DisplayGender());
//        System.out.println("HP: "+ player.getStats().getHp().getHp()+"/"+ player.getStats().getHp().getMaxHp());
//        System.out.println("ATK: "+player.getStats().getAttack().getOffensivePower() );
//        System.out.println("DEF: "+player.getStats().getDefence().getDefensePower());

    }
}

