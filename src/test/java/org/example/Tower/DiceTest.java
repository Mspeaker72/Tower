package org.example.Tower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    public Dice die = new Dice();

    @Test
    void rollDice() {
        assertTrue(die.rollDice()<3);
    }
}