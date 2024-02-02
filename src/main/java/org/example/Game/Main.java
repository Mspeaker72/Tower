package org.example.Game;

import org.example.CharacterRelated.Character;
import org.example.CharacterRelated.Gender;
import org.example.CharacterRelated.Player;
import org.example.CharacterRelated.Stats;
import org.example.CombatRelated.defensiveRating;
import org.example.CombatRelated.hitPoints;
import org.example.CombatRelated.offenseRating;
import org.example.CombatRelated.playerLevel;
import org.example.Scenes.InventoryPage;
import org.example.Scenes.StatusPage;
import org.example.Tower.Tower;

public class Main {
    public static void main(String[] args) {

        PlayTower game = new PlayTower();

        if(game.gameState().equals("quit")){
            System.exit(0);
        } else if (game.getPrompt().getState().equals("start")) {
            game.buildCharacter();
        }
//      Constructor will change after saving feature is added
        Tower tower = new Tower(game.initializePlayer(game.getPrompt().getState()));
        // Commands will begin here
        while(!game.getPrompt().getCurrentCommand().equals("quit")) {
            game.getPrompt().nextMove(tower.getPlayer());
            tower.execute(game.getPrompt().getCurrentCommand());
        }
        System.exit(0);
        }
    }
