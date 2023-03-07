package com.example.springsecurityservice.demo;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();

        input.put("Apple","qua tao");
        input.put("Asus","may tinh Asus");
        input.put("Book","sach");
        input.put("Cook","com");
        input.put("Back","tro lai");
        input.put("Character","ky tu");

        for (Map.Entry<String,Map<String,String>> entry : convertToMap(input).entrySet())
        {
            System.out.println(entry);
        }
    }
    public static Map<String,Map<String,String>> convertToMap(Map<String,String> mapInput) {

        Map<String, Map<String, String>> mapResponse = new HashMap<>();
        for (Map.Entry<String, String> entry : mapInput.entrySet()){
//            get char index 0
            String currentCharacter = String.valueOf(entry.getKey().charAt(0));
            if(!mapResponse.containsKey(currentCharacter)){
                mapResponse.put(currentCharacter,new HashMap<>());
            }

            mapResponse.get(currentCharacter).put(entry.getKey(), entry.getValue());

        }
        return mapResponse;
    }

}
