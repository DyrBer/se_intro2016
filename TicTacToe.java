public class TicTacToe {
    private Player player1;
    private Player player2;
    private GameWriter writer;
    private Field field = new Field(3);


    private boolean makePlayerMove(Player player, GameWriter writer) {

        Move move = player.getMove(field);
        field.makeMove(move, player.getLabel());
        System.out.println("Игрок " + player.getLabel() + ":");
        field.print();
        if (field.isEnd()) {
            this.writer.writeWin(player.getLabel());
            return true;
        }
        if (field.isDraw()) {
            this.writer.writeDraw();
            return true;
        }
        return false;
    }

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        this.writer = new SoutGameWriter();
        boolean isEnd = makePlayerMove(player1, writer);
        if (isEnd) {
            return;
        }
        isEnd = makePlayerMove(player2, writer);
        if (isEnd) {
            return;
        }
        runGame();
    }

    public static int k = 0;
    public static int k1 = 0;
    public static int k2 = 0;
    private boolean makePlayerMoveForResult(Player player) {

        Move move = player.getMove(field);
        field.makeMove(move, player.getLabel());
        if (field.isEnd()) {
            if (player.getLabel() == 1)
                k++;
            if (player.getLabel() == 2)
                k1++;
            return true;
        }
        if (field.isDraw()) {
            k2++;
            return true;
        }
        return false;
    }

    public void runGameForResult() {
        boolean isEnd = makePlayerMoveForResult(player1);
        if (isEnd) {
            return;
        }
        isEnd = makePlayerMoveForResult(player2);
        if (isEnd) {
            return;
        }
        runGameForResult();
    }

    public void Result(int n) {
        for (int i = 0; i < n; i++) {
            TicTacToe game = new TicTacToe(player1, player2);
            game.runGameForResult();
        }
        System.out.println("Побед игрока 1: " + k);
        System.out.println("Побед игрока 2: " + k1);
        System.out.println("Ничьих: " + k2);
    }

}

