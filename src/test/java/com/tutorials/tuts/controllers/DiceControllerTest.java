package com.tutorials.tuts.controllers;

import com.tutorials.tuts.data.DiceExpression;
import com.tutorials.tuts.responses.RollDiceResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceControllerTest {
    DiceController diceController = new DiceController();

    @Test
    void rollDice() {
        DiceExpression diceExpression = new DiceExpression("3d2");
        RollDiceResponse response = diceController.rollDice(diceExpression);
        assertEquals(diceExpression.expression(), response.expression());
        assertEquals(0, response.total());
    }
}