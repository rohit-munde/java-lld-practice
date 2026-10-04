package strategy;

import interfaces.IRollStrategy;

public class CrookedRollStrategy implements IRollStrategy {

    @Override
    public int roll() {
        int[] possibleRolls = {2, 4, 6};
        int randomIndex = (int)(Math.random() * possibleRolls.length);
        return possibleRolls[randomIndex];
    }

    @Override
    public String toString() {
        return "CrookedRollStrategy";
    }
}
