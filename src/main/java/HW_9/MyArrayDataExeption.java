package HW_9;

public class MyArrayDataExeption extends RuntimeException {

    private int row;
    private int collumn;

    public int getRow() {
        return row;
    }

    public int getCollumn() {
        return collumn;
    }

    public MyArrayDataExeption(String message, int row, int collumn) {
        super(message);
        this.row = row;
        this.collumn = collumn;
    }
}
