package JAVA8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortGivenElement {

    public static void main(String[] z)
    {
        List<Integer> listIn = Arrays.asList(5,3,6,12,1,0);

        listIn.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
