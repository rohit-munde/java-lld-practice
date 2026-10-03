package models;

public class Ladder extends Jump {
    public Ladder(int start, int end) {
        super(start, end);

        if(start >= end) {
            throw new IllegalArgumentException("Invalid ladder position. Start position must be less than end position.");
        }
    }

    @Override
    public String getType() {
        return "Ladder";
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "start=" + getStart() +
                ", end=" + getEnd() +
                '}';
    }
}
