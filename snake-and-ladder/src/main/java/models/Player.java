package models;

import interfaces.IRollStrategy;

public class Player {
    private final String id;
    private final String name;
    private int position;
    private IRollStrategy rollStrategy;

    public Player(String id, String name, IRollStrategy rollStrategy) {
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
