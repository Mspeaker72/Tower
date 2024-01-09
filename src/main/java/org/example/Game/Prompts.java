package org.example.Game;

import java.util.Scanner;

public class Prompts {

    private String name;
    private String genderCode;

    private final Scanner scanner = new Scanner(System.in);
    public void greeting(){
        System.out.println("Please type start to play game or quit to exit");
        if(scanner.nextLine().equals("start")){
            System.out.println();
            System.out.println("Welcome to the Tower");
            System.out.println();

        }else {
            System.exit(-1);
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


    public String getGenderCode() {
        return genderCode;
    }

    public String getName() {
        return name;
    }
}
