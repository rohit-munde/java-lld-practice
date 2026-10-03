package models;

public class Board {
    private final Cell[] cells;
    private static final int size = 100; // Assuming a 10x10 board
    private Jump jump;
    public Board() {
        cells = new Cell[size];

        for (int i = 0; i < size; i++) {
            cells[i] = new Cell(i + 1);
        }
    }

    public Cell getCell(int number) {
        return cells[number - 1];
    }

    public void AddJump(Jump jump) {
        if(jump.getStart() < 1 || jump.getStart() > size || jump.getEnd() < 1 || jump.getEnd() > size) {
            throw new IllegalArgumentException("Jump positions must be within the board limits.");
        }

        Cell startCell = getCell(jump.getStart());
        startCell.setJump(jump);
    }

    public int ResolvedPosition(int position) {
        Cell cell = getCell(position);
        if (cell.getJump() != null) {
            return cell.getJump().getEnd();
        }
        return position;
    }

    public int ResolvePosition(int position) {
        return ResolvedPosition(position);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Board{" +
                "size=" + size +
                '}';
    }
}
