package com.tutorials.tuts.dice;

public class DiceParser {
    public DiceRoll diceRoll(String diceExpression) {
        return switch (diceExpression) {
            case "3d6" -> new DiceRoll(3, 6, 0);
            case "3d6+2" -> new DiceRoll(3, 6, 2);
            case "3d6-2" -> new DiceRoll(3, 6, -2);
            default -> throw new IllegalArgumentException("Invalid dice expression: " + diceExpression);
        };
    }
}
