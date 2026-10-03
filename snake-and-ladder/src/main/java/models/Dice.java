package models;

import interfaces.IRollStrategy;

public class Dice {
    private final IRollStrategy rollStrategy;

    public Dice(IRollStrategy rollStrategy) {
        this.rollStrategy = rollStrategy;
    }

    public int Roll() {
        return rollStrategy.Roll();
    }

    public int getRollStrategy() {
        return rollStrategy.Roll();
    }

    @Override
    public String toString() {
        return "Dice{" +
                "rollStrategy=" + rollStrategy +
                '}';
    }
}
