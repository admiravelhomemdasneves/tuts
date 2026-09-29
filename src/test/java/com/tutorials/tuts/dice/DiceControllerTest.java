package com.tutorials.tuts.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceControllerTest {
    DiceParser diceParser;
    DiceController diceController = new DiceController(diceParser);

    @Test
    void rollDice() {
        RollRequest rollRequest = new RollRequest("3d2");
        RollResponse response = diceController.rollDice(rollRequest);
        assertEquals(rollRequest.expression(), response.expression());
        assertEquals(0, response.total());
    }
}