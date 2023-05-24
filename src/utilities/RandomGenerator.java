package utilities;

import java.util.Random;

public class RandomGenerator {
    //Write a method that generates random number between the range given and return it
    public static int getRandomNumber(int start, int end){
        return new Random().nextInt(end - start + 1) + start;
    }
}
