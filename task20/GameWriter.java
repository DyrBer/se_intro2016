public interface GameWriter {
    void writeMove(int playerLabel, Field field);
    void writeWin(int playerLabel);
    void writeDraw();
}
