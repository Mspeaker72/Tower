package org.example.CharacterRelated;

import java.util.HashMap;
import java.util.Map;

public class Gender {

    private final String genderCode;

    private HashMap<String,String> CodeMap = new HashMap<>();

    private void createMap(){
        this.CodeMap.put("M","Male");
        this.CodeMap.put("F","Female");
    }

    public Gender(String genderCode){
        this.genderCode = genderCode;
        createMap();
    }

    public String DisplayGender(){
        return this.CodeMap.get(genderCode);
    }
}
