package JAVA8;

import java.security.SecureRandom;
import java.util.Random;

public class RandomSample {

    public static void main(String a[])
    {
        Random rm = new Random();
        rm.ints().limit(10).forEach(System.out::println);

        SecureRandom srm = new SecureRandom();
        srm.ints().limit(10).forEach(System.out::println);
    }
}
