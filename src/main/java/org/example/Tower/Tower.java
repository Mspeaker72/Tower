package org.example.Tower;


import org.example.CharacterRelated.Player;
import org.example.Scenes.StatusPage;

public class Tower implements Towers {

    private Player player;

    private Floor floor;

    private StatusPage statusPage;


    public Tower(Player player){
        this.player = player;
        this.floor = new Floor();
        this.statusPage = new StatusPage(player);
    }


    @Override
    public Floor getFloor() {
        return null;
    }

    @Override
    public void PlayerStatus() {
        statusPage.displayPage();
    }
}
