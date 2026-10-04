package models;

public class Board {
    private final Cell[] cells;
    private final int size; // Assuming a 10x10 board

    public Board(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Board size must be positive.");
        }

        this.size = size;
        cells = new Cell[size];

        for (int i = 0; i < size; i++) {
            cells[i] = new Cell(i + 1);
        }
    }

    public Cell getCell(int number) {
        return cells[number - 1];
    }

    public void addJump(Jump jump) {
        if (jump == null) {
            throw new IllegalArgumentException("Jump cannot be null.");
        }

        if (jump.getStart() < 1 || jump.getStart() > size || jump.getEnd() < 1 || jump.getEnd() > size) {
            throw new IllegalArgumentException("Jump positions must be within the board limits.");
        }

        if (jump.getStart() == size) {
            throw new IllegalArgumentException("Jump cannot start from the final cell.");
        }

        Cell startCell = getCell(jump.getStart());

        if (startCell.getJump() != null) {
            throw new IllegalArgumentException("A jump already exists at this cell.");
        }

        startCell.setJump(jump);
    }

    public int resolvedPosition(int position) {
        Cell cell = getCell(position);
        if (cell.getJump() != null) {
            return cell.getJump().getEnd();
        }
        return position;
    }

    public int resolvePosition(int position) {
        return resolvedPosition(position);
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
