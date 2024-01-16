package org.example.Game;

import org.example.CharacterRelated.Gender;
import org.example.CharacterRelated.Player;
import org.example.CharacterRelated.Stats;
import org.example.CombatRelated.defensiveRating;
import org.example.CombatRelated.hitPoints;
import org.example.CombatRelated.offenseRating;
import org.example.CombatRelated.playerLevel;

public class PlayTower implements Play{

    private final Prompts prompts;

    public PlayTower(){
        prompts = new Prompts();
    }

    @Override
    public String gameState() {
        prompts.greeting();
        return prompts.getState();

    }

    @Override
    public void buildCharacter() {
        prompts.playerName();
        prompts.playerGender();
    }

    public Player initializePlayer(String state){

        if(state.equals("start")) {
            Gender gender = new Gender(prompts.getGenderCode());
            playerLevel playerLevel = new playerLevel();
            offenseRating offenseRating = new offenseRating();
            hitPoints hitPoints = new hitPoints();
            defensiveRating defensiveRating = new defensiveRating();
            Stats newPlayer = new Stats(playerLevel, hitPoints, offenseRating, defensiveRating);

            return new Player(gender, newPlayer, prompts.getName());
        }
        Gender gender = new Gender("F");
        playerLevel playerLevel = new playerLevel();
        offenseRating offenseRating = new offenseRating();
        hitPoints hitPoints = new hitPoints();
        defensiveRating defensiveRating = new defensiveRating();
        Stats newPlayer = new Stats(playerLevel, hitPoints, offenseRating, defensiveRating);

        return new Player(gender, newPlayer, "Jane Doe");

    }

    @Override
    public Prompts getPrompt() {
        return prompts;
    }


}
