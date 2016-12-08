public class Field {
    private int[][] data;

    public Field(int size) {
        this.data = new int[size][size];
    }

    public int get(int i, int j) {
        return data[i][j];
    }

    public boolean isEmpty(int i, int j) {
        return data[i][j] == 0;
    }

    public int getSize() {
        return data.length;
    }

    public void makeMove(Move move, int label) {
        if (data[move.getX()][move.getY()] == 0) {
            data[move.getX()][move.getY()] = label;
        }
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isDraw() {
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] == 0) {
                    k++;
                }
            }
        }
        if (k == 0) {
            return true;
        }
        return false;
    }


    public boolean isEnd() {
        if ((data[0][0] != 0) & (data[0][0] == data[0][1]) & ( data[0][0] == data[0][2]))
            return true;
        if ((data[1][0] != 0) & (data[1][0] == data[1][1]) & ( data[1][0] == data[1][2]))
            return true;
        if ((data[2][0] != 0) & (data[2][0] == data[2][1]) & ( data[2][0] == data[2][2]))
            return true;
        if ((data[0][0] != 0) & (data[0][0] == data[1][0]) & ( data[0][0] == data[2][0]))
            return true;
        if ((data[0][1] != 0) & (data[0][1] == data[1][1]) & ( data[0][1] == data[2][1]))
            return true;
        if ((data[0][2] != 0) & (data[0][2] == data[1][2]) & ( data[0][2] == data[2][2]))
            return true;
        if ((data[0][0] != 0) & (data[0][0] == data[1][1]) & ( data[0][0] == data[2][2]))
            return true;
        if ((data[0][2] != 0) & (data[0][2] == data[1][1]) & ( data[0][2] == data[2][0]))
            return true;
    return false;
    }

}
