package Game;

import java.util.Random;

/**
 * Created by cerebro on 12/09/16.
 */
public class Util {
    private static Random random = new Random();

    public static int randomInt(int lowerLimit, int uppperLimit) {
        return random.nextInt(uppperLimit - lowerLimit) + lowerLimit;
    }

    public static int randomInt(int upperLimit) {
        return Util.randomInt(0, upperLimit);
    }
}
