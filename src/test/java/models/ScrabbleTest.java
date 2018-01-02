package models;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore('a'));
    }
}