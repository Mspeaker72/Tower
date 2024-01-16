package org.example.Game;

import java.util.Scanner;

public class Prompts {

    private String name;
    private String genderCode;

    private String State;

    private final Scanner scanner = new Scanner(System.in);
    public void greeting(){
        System.out.println("Please type start to play game , load to continue or quit to exit");
        this.State=scanner.nextLine();
    }

    public void playerName(){
        System.out.println("Could you tell me you name");
        this.name = scanner.nextLine();
    }

    public void playerGender(){
        System.out.println("who do you wish to play as M for a man and F for a woman");
        this.genderCode = scanner.nextLine();
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
}
