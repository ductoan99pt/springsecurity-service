package com.example.springsecurityservice.demo;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();

        input.put("Apple","qua tao");
        input.put("Asus","may tinh Asus");
        input.put("Book","sach");
        input.put("Cook","com");

        for (Map.Entry<String,Map<String,String>> entry : convertToMap(input).entrySet())
        {
            System.out.println(entry);
        }
    }
    public static Map<String,Map<String,String>> convertToMap(Map<String,String> mapInput) {

        Map<String, Map<String, String>> mapResponse = null;
        Set<String> keyInput = mapInput.keySet();
        Set<String> setCharacter = new HashSet<>();
        for (String key : keyInput) {
            String character = String.valueOf(key.charAt(0));
            for (Map.Entry<String, String> entry : mapInput.entrySet()) {
                if (entry.getKey().startsWith(character)) {

                }
            }
        }
        return mapResponse;
    }

}
