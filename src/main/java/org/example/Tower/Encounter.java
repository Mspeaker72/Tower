package org.example.Tower;

import org.example.CharacterRelated.Player;

public interface Encounter {


    public Player wellSpringOfLife(Player player);

    public  Player  RandomBattle(Player player , Floor floor);

    public  Player trap(Player player);

        /*
        -based on floor multiple enemies can appear
        -each boss has a fixed encounter but random encounters vary
        -other events can heal the player or give them an item
        -bosses and creatures may drop items

     */


}
