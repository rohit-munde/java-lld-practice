package models;

import interfaces.IRollStrategy;

public class Dice {
    private final IRollStrategy rollStrategy;

    public Dice(IRollStrategy rollStrategy) {
        this.rollStrategy = rollStrategy;
    }

    public int roll() {
        return rollStrategy.roll();
    }

    public int getRollStrategy() {
        return rollStrategy.roll();
    }

    @Override
    public String toString() {
        return "Dice{" +
                "rollStrategy=" + rollStrategy +
                '}';
    }
}
