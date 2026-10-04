package models;

import interfaces.IRollStrategy;

public class Dice {
    private final IRollStrategy rollStrategy;

    public Dice(IRollStrategy rollStrategy) {
        if (rollStrategy == null) {
            throw new IllegalArgumentException("Roll strategy cannot be null.");
        }

        this.rollStrategy = rollStrategy;
    }

    public int roll() {
        return rollStrategy.roll();
    }

    @Override
    public String toString() {
        return "Dice{" +
                "rollStrategy=" + rollStrategy +
                '}';
    }
}
