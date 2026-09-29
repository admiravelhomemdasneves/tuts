package com.tutorials.tuts.responses;

import com.tutorials.tuts.data.DiceExpression;

public record RollDiceResponse(String expression, int total) {
}
