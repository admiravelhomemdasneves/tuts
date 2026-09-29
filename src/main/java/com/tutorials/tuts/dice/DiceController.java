package com.tutorials.tuts.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {
    private final DiceParser parser;

    public DiceController(DiceParser parser) {
        this.parser = parser;
    }

    @PostMapping("/roll")
    public RollResponse rollDice(@RequestBody RollRequest rollRequest) {
        final DiceRoll roll = parser.diceRoll(rollRequest.expression());
        final int total = roll.count() + roll.modifier();

        return new RollResponse(rollRequest.expression(), total);
    }
}
