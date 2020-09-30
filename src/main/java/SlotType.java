public enum SlotType {
    A1(1,1,1),
    A2(2,1,2),
    A3(3,1,3),
    B1(4,2,1),
    B2(5,2,2),
    B3(6,2,3),
    C1(7,3,1),
    C2(8,3,2),
    C3(9,3,3);

    private final int row;
    private final int column;
    private final int position;

    SlotType(int position, int row, int column) {
        this.row = row;
        this.column = column;
        this.position = position;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPosition() {
        return position;
    }
}
