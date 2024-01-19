package org.example.Admin;

import java.io.FileWriter;
import java.io.IOException;

public class LoggingTower {


    public static void processRollLog(String details){
        try {
            FileWriter logRolls = new FileWriter("dice.txt" , true);
            logRolls.append(details);
            logRolls.append(System.lineSeparator());
            logRolls.close();
        }  catch (IOException fileError){
            System.out.println(fileError.getMessage());
        }

    }

}
