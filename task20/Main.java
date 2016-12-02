import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player1 = new RandomPlayer(1);
        Player player2 = new RandomPlayer(2);
        TicTacToe game = new TicTacToe(player1, player2);
        game.result(1000);
    }
}
