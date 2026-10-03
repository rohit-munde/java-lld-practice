package models;

public abstract class Jump {
    private final int start;
    private final int end;
//    public abstract String getType();
//    private String type;

    protected Jump(int start, int end) {
        this.start = start;
        this.end = end;
//        this.type = type;
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

//    public void setType(String type) {
//        this.type = type;
//    }

    @Override
    public String toString() {
        return "Jump{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
