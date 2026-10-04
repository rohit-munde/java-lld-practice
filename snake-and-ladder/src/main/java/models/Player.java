package models;

import interfaces.IRollStrategy;
import strategy.NormalRollStrategy;

public class Player {
    private final String id;
    private final String name;
    private int position;
    private final IRollStrategy rollStrategy;

    public Player(String id, String name) {
        this(id, name, new NormalRollStrategy());
    }

    public Player(String id, String name, IRollStrategy rollStrategy) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Player id cannot be blank.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Player name cannot be blank.");
        }

        if (rollStrategy == null) {
            throw new IllegalArgumentException("Roll strategy cannot be null.");
        }

        this.id = id;
        this.name = name;
        this.position = 0;
        this.rollStrategy = rollStrategy;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveTo(int position) {
        this.position = position;
    }

    public IRollStrategy getRollStrategy() {
        return rollStrategy;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", rollStrategy=" + rollStrategy +
                '}';
    }
}
