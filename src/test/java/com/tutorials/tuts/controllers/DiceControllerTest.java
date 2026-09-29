package com.tutorials.tuts.controllers;

import com.tutorials.tuts.dice.DiceController;
import com.tutorials.tuts.dice.RollRequest;
import com.tutorials.tuts.dice.RollResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceControllerTest {
    DiceController diceController = new DiceController();

    @Test
    void rollDice() {
        RollRequest rollRequest = new RollRequest("3d2");
        RollResponse response = diceController.rollDice(rollRequest);
        assertEquals(rollRequest.expression(), response.expression());
        assertEquals(0, response.total());
    }
}