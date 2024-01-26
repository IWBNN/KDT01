package secondweek.mathclasstest;

import java.util.Random;

public class MathClassSample {
    public static void main(String[] args) {
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue);
        Random rnd = new Random();
        int lottoSingleNumber = rnd.nextInt(1, 45);
        System.out.println(lottoSingleNumber);
    }
}
