package strategy;

import interfaces.IRollStrategy;

import java.util.Random;

public class BiasedRollStrategy implements IRollStrategy {
    private final int biasedNumber;
    private final Random random = new Random();

    public BiasedRollStrategy(int biasedNumber) {
        this.biasedNumber = biasedNumber;
    }

    @Override
    public int roll() {
        int chance = random.nextInt(100) + 1;
        if (chance <= 50) {
            return biasedNumber;
        }
        return random.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "BiasedRollStrategy";
    }
}
