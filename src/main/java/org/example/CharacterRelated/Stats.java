package org.example.CharacterRelated;

import org.example.CombatRelated.defensiveRating;
import org.example.CombatRelated.hitPoints;
import org.example.CombatRelated.offenseRating;
import org.example.CombatRelated.playerLevel;

public class Stats {


    private playerLevel level;

    private hitPoints Hp;

    private offenseRating attack;

    private defensiveRating Defence;

    public Stats (playerLevel level,hitPoints hp,offenseRating attack,defensiveRating defence){

        this.level =level;
        this.Hp =hp;
        this.attack=attack;
        this.Defence =defence;

    }

    public defensiveRating getDefence() {
        return Defence;
    }

    public hitPoints getHp() {
        return Hp;
    }

    public offenseRating getAttack() {
        return attack;
    }

    public playerLevel getLevel() {
        return level;
    }
}
