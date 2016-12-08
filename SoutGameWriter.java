public class SoutGameWriter implements GameWriter {
    public void writeMove(int playerLabel, Field field) {
        System.out.println("Игрок" + playerLabel + ":");
        printField(field);
    }

    public void writeWin(int playerLabel) {
        System.out.println("Выиграл игрок " + playerLabel);

    }

    public void writeDraw() {
        System.out.println("Ничья");
    }
    private void printField(Field field) {
        for (int i = 0; i < field.getSize(); i++) {
            for(int j = 0; j < field.getSize(); j++) {
                System.out.print(field.get(i,j) + " ");
            }
            System.out.println();
        }
    }
}
