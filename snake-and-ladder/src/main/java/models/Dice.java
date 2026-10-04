package models;

import interfaces.IRollStrategy;

public class Dice {
    private final IRollStrategy rollStrategy;

    public Dice(IRollStrategy rollStrategy) {
        this.rollStrategy = rollStrategy;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "rollStrategy=" + rollStrategy +
                '}';
    }
}
