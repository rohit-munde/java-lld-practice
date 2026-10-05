package models;

public abstract class Jump {
    private final int start;
    private final int end;

    protected Jump(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Getters
    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getType() {
      if(getStart() < getEnd()) {
          return "Ladder";
      } else if(getStart() > getEnd()) {
          return "Snake";
      }
      return null;
    }

    @Override
    public String toString() {
        return "Jump{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
