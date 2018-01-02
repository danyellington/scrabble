package models;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 10;
        assertEquals(expected, testScrabble.calculateScore("z"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleWord_int() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 14;
        assertEquals(expected, testScrabble.calculateScore("scrabble"));
    }
}