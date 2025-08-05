package JAVA8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class FunctionalInterface {

    public static void main(String[] a)
    {
        int[] b = {1, 4, 3,7,2};

        ArrayList<Integer> arralist = new ArrayList<>();
        arralist.add(1);
        arralist.add(5);
        arralist.add(3);
        arralist.add(2);

        arralist.stream().forEach(System.out::println);

        arralist.forEach(System.out::println);

        arralist.stream().filter(c -> c == 5).
        forEach(System.out::println);

        Optional<Integer> bool = arralist.stream().filter(s -> s==15).findAny();

        System.out.println(bool.isPresent());

        arralist.stream().map(v -> v * v * v).forEach(System.out::println);

    }

}
