package org.example.Tower;

import org.example.CharacterRelated.Player;
import org.example.CombatRelated.offenseRating;

public class TowerEvents implements Encounter{
    private final Battle battle = new Battle();

    @Override
    public Player wellSpringOfLife(Player player) {
        player.getStats().getAttack().updateOffensivePower(
                player.getStats().getAttack().getOffensivePower()+1);
        player.getStats().getDefence().setDefensePower(
                player.getStats().getDefence().getDefensePower()+1);
        player.getStats().getHp().setMaxHp(

                player.getStats().getHp().getMaxHp()+5);
        System.out.println("Drank from the well spring ");

        return player;

    }

    @Override
    public Player RandomBattle(Player player , Floor floor) {
        battle.battling(player,floor);
        return battle.result();
    }

    @Override
    public Player trap(Player player) {
        System.out.println("you have been hurt by spikes");
        player.getStats().getHp().TakeDamage(2);
        return player;

    }

    public Player occurrence(int number, Player player, Floor floor){
        return switch (number) {
            case 0 -> wellSpringOfLife(player);
            case 1 -> RandomBattle(player, floor);
            case 2 -> trap(player);
            default -> player;
        };
    }
}
