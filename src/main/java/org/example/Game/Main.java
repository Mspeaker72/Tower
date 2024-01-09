package org.example.Game;

import org.example.CharacterRelated.Gender;
import org.example.CharacterRelated.Player;
import org.example.CharacterRelated.Stats;
import org.example.CombatRelated.defensiveRating;
import org.example.CombatRelated.hitPoints;
import org.example.CombatRelated.offenseRating;
import org.example.CombatRelated.playerLevel;
import org.example.Scenes.InventoryPage;
import org.example.Scenes.StatusPage;

public class Main {
    public static void main(String[] args) {

        PlayTower game = new PlayTower();

        Gender gender = new Gender("M");
        playerLevel playerLevel = new playerLevel();
        offenseRating offenseRating = new offenseRating();
        hitPoints hitPoints = new hitPoints();
        defensiveRating defensiveRating = new defensiveRating();

        Stats newPlayer = new Stats(playerLevel,hitPoints,offenseRating,defensiveRating);

        Player player = new Player(gender,newPlayer);

        game.startNewGame();
        game.buildCharacter();




        }
    }
