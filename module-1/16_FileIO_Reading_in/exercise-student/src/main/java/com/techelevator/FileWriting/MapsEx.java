package com.techelevator.FileWriting;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MapsEx {

    //           key     value
    private Map<String, Integer> counter = new HashMap<>();

    public Map<String, Integer> countOccurances(String input) {
        if (input == null || input.isEmpty()) {
            return new HashMap<String, Integer>();
        }

        // Elevate Yourself
        input = input.toLowerCase();

        // elevate yourself
        String[] letters = input.split("|");
        for (String letter : letters) {
            if (!letter.isBlank()) {
                if (!counter.containsKey(letter)) {
                    counter.put(letter, 1);
                } else {
                    int oldCount = counter.get(letter);
                    int newCount = oldCount + 1;
                    counter.put(letter, newCount);
                }
            }
        }
        return counter;
    }
}
