package strategy;

import interfaces.IRollStrategy;

public class CheatingStrategy implements IRollStrategy {
    @Override
    public int roll() {
        return 1; // Always returns the maximum roll value
    }

    @Override
    public String toString() {
        return "CheatingStrategy";
    }
}
