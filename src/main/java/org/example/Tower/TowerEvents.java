package org.example.Tower;

import org.example.CharacterRelated.Player;
import org.example.CombatRelated.offenseRating;

public class TowerEvents implements Encounter{
    @Override
    public Player wellSpringOfLife(Player player) {

        offenseRating atk = player.getStats().getAttack().
                updateOffensivePower(player.getStats().
                        getAttack().getOffensivePower()+1);
        player.getStats().setAttack(atk);
        System.out.println("healing");
        return player;

    }

    @Override
    public Player RandomBattle(Player player , Floor floor) {
        System.out.println("battling");
        return player;
    }

    @Override
    public Player trap(Player player) {
        System.out.println("you have been hurt by spikes");
        player.getStats().getHp().TakeDamage(5);
        return player;

    }

    public Player occurrence(int number, Player player, Floor floor){
        switch (number){
            case 0:
                return wellSpringOfLife(player);
            case 1:
                return RandomBattle(player,floor);
            case 2:
                return trap(player);
        }
        return player;
    }
}
