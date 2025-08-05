package JAVA8Practice;

import java.util.Comparator;
import java.util.List;

public class DescOrderGivenElement {

    public static void main(String[] z)
    {
        List<Integer> listIn = List.of(6,7,3,5,9,1,2);

        listIn.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
