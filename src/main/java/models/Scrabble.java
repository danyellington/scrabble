package models;

import java.util.Map;
import java.util.HashMap;

public class Scrabble {
    private static Character[] letterKeys = new Character[] { 'A', 'B', 'C', 'D',
                                                                'E', 'F', 'G', 'H',
                                                                'I', 'J', 'K', 'L',
                                                                'M', 'N', 'O', 'P',
                                                                'Q', 'R', 'S', 'T',
                                                                'U', 'V', 'W', 'X',
                                                                'Y', 'Z' };

    public Integer calculateScore(String word) {
        Map<Character, Integer> wordsAndNumbers = new HashMap<Character, Integer>();
        int score = 0;
        char[] charArray = word.toUpperCase().toCharArray();

        for (char eachLetter : letterKeys) {
            if (eachLetter == 'A' || eachLetter == 'E' || eachLetter == 'I' || eachLetter == 'O' || eachLetter =='U' || eachLetter == 'L' || eachLetter == 'N' || eachLetter == 'R' || eachLetter == 'S' || eachLetter == 'T')  {
                    wordsAndNumbers.put(eachLetter, 1);
                } else if (eachLetter == 'D' || eachLetter == 'G') {
                    wordsAndNumbers.put(eachLetter, 2);
                } else if (eachLetter == 'B' || eachLetter == 'C' || eachLetter == 'M' || eachLetter == 'P') {
                    wordsAndNumbers.put(eachLetter, 3);
                } else if (eachLetter == 'F' || eachLetter == 'H' || eachLetter == 'V' || eachLetter == 'W' || eachLetter == 'Y') {
                    wordsAndNumbers.put(eachLetter, 4);
                } else if (eachLetter == 'K') {
                    wordsAndNumbers.put(eachLetter, 5);
                } else if (eachLetter == 'J' || eachLetter == 'X') {
                    wordsAndNumbers.put(eachLetter, 8);
                } else if (eachLetter == 'Q' || eachLetter == 'Z') {
                    wordsAndNumbers.put(eachLetter, 10);
                }
        }

        for (char eachChar : charArray) {
            if (wordsAndNumbers.containsKey(eachChar)) {
                score += wordsAndNumbers.get(eachChar);
            }
        }

        return score;
    }
}
