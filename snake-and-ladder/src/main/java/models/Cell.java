package models;

public class Cell {
    private final int number;
    private Jump jump;

    public Cell(int number) {
        this.number = number;
    }

    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "number=" + number +
                ", jump=" + jump +
                '}';
    }
}
