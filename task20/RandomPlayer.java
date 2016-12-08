import java.util.Random;

public class RandomPlayer implements Player {
    private int label;

    public RandomPlayer(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }

    public Move getMove(Field field) {
        Random random = new Random();
        int i = random.nextInt(field.getSize());
        int j = random.nextInt(field.getSize());
        if (field.isEmpty(i, j)) {
            return new Move(i, j);
        }
        return getMove(field);
    }
}
