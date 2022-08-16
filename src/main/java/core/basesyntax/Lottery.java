package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Ball getRandomBall() {
        int upperLimit = 100;
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(upperLimit));
    }
}
