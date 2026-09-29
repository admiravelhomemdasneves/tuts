package com.tutorials.tuts.controllers;

import com.tutorials.tuts.data.DiceExpression;
import com.tutorials.tuts.responses.RollDiceResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {
    @PostMapping("/roll")
    public RollDiceResponse rollDice(@RequestBody DiceExpression diceExpression) {
        return new RollDiceResponse(diceExpression.expression(), 0);
    }
}
