package models;

import interfaces.IRollStrategy;

public class NormalRollStrategy implements IRollStrategy {

    @Override
    public int Roll() {
        return (int)(Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
        return "NormalRollStrategy";
    }
}
