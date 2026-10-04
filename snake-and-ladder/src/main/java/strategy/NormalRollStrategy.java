package strategy;

import interfaces.IRollStrategy;

public class NormalRollStrategy implements IRollStrategy {

    @Override
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
        return "NormalRollStrategy";
    }
}
