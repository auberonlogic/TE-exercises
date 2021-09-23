package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class HomeworkTests {

    public static void main(String[] args) {

        Map<String, String> animalMap = new HashMap<>();
        animalMap.put("rhino", "Crash");
        animalMap.put("giraffe", "Tower");
        animalMap.put("elephant", "Herd");
        animalMap.put("lion", "Pride");
        animalMap.put("crow", "Murder");
        animalMap.put("pigeon", "Kit");
        animalMap.put("flamingo", "Pat");
        animalMap.put("deer", "Herd");
        animalMap.put("dog", "Pack");
        animalMap.put("crocodile", "Float");

        String animalName = "Rhino";
        if (animalName.equals("") || !animalMap.containsKey(animalName.toLowerCase())) {
            System.out.println("unknown");
        } else {
            System.out.println(animalMap.get(animalName.toLowerCase()));
        }

    }
}
