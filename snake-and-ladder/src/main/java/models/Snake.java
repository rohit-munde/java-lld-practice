package models;

public class Snake extends Jump {
    public Snake(int start, int end) {
        super(start, end);

        if(start <= end) {
            throw new IllegalArgumentException("Invalid snake position. Start position must be greater than end position.");
        }
    }

    @Override
    public String getType() {
        return "Snake";
    }

    @Override
    public String toString() {
        return "Snake{" +
                "start=" + getStart() +
                ", end=" + getEnd() +
                '}';
    }
}
