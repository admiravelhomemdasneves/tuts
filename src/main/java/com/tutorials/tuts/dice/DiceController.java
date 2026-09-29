package com.tutorials.tuts.dice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {
    @PostMapping("/roll")
    public RollResponse rollDice(@RequestBody RollRequest rollRequest) {
        return new RollResponse(rollRequest.expression(), 0);
    }
}
