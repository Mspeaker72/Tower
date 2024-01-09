package org.example.Game;

public class PlayTower implements Play{

    private final Prompts prompts;

    public PlayTower(){
        prompts = new Prompts();
    }

    @Override
    public void startNewGame() {
        prompts.greeting();
    }

    @Override
    public void buildCharacter() {
        prompts.playerName();
        prompts.playerGender();
    }
}
