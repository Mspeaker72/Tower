package org.example.Game;

public interface Play {

/*
There will be a welcome message that prompts the player to
start or quit game
 */

    public String gameState();

    public void buildCharacter();

    public Prompts getPrompt();


}
