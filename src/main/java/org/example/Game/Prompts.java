package org.example.Game;

import org.example.CharacterRelated.Player;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Prompts {

    private String name;
    private String genderCode;

    private final Stream<String> validCommands = Stream.of("start","load","quit");

    private String currentCommand = "null";

    private String State;

    private final Scanner scanner = new Scanner(System.in);



    public void greeting(){
        System.out.println("Please type start to play game , load to continue or quit to exit");
        this.State=scanner.nextLine();
        if(validCommands.anyMatch(string -> string.equals(State))){
            System.out.println("...loading...");
            System.out.println();
        }else {
            System.out.println("error handling in development");
            System.exit(0);
        }

    }

    public void playerName(){
        System.out.println("Could you tell me you name");
        this.name = scanner.nextLine();
    }

    public void playerGender(){
        System.out.println("who do you wish to play as M for a man and F for a woman");
        this.genderCode = scanner.nextLine();
    }

    public void nextMove(Player player){
        System.out.println("What will you do next "+player.name());
        this.currentCommand = scanner.nextLine();

    }


    public String getGenderCode() {
        return genderCode;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return State;
    }

    public String getCurrentCommand() {
        return currentCommand;
    }
}
