package org.example.Tower;


import org.example.CharacterRelated.Player;
import org.example.Scenes.StatusPage;

public class Tower implements Towers {

    private Player player;

    private Floor floor;

    private StatusPage statusPage;

    private Dice dice;




    public Tower(Player player){
        this.player = player;
        this.floor = new Floor(player);
        this.statusPage = new StatusPage(player);
        this.dice = new Dice();
    }

    public Tower(Player player, Floor floor){
        this.player = player;
        this.floor = floor;
        this.statusPage = new StatusPage(player);
        this.dice = new Dice();

    }


    @Override
    public Floor getFloor() {
        return this.floor;
    }

    @Override
    public void playerStatus() {

        statusPage.updateState(player);
        statusPage.displayPage();
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public void execute(String currentCommand) {
        switch (currentCommand){
            case  "roll":
                walk();
                break;

            case "status":
                playerStatus();
                break;
        }
    }

    @Override
    public void walk() {
        this.floor.step( this.dice.rollDice());
        this.floor.update();
        this.player =this.floor.getPlayerState();
    }
}
