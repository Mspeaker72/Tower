package org.example.Tower;

import org.example.CharacterRelated.Player;

public interface Towers {


/*

-A tower has 100 floors
-each tenth floor has a boss monster


 */

public Floor getFloor();


public void playerStatus();


public void walk();

public Player getPlayer();


    void execute(String currentCommand);
}







