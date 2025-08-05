package JAVA8Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

    public static void main(String[] z)
    {
        List<Integer> list = Arrays.asList(5,6,5,4,7,4);

        Set<Integer> hashSet = new HashSet<>();

        List<Integer> dupList = list.stream().
                filter(v -> !hashSet.add(v) ).
               // peek(System.out::println).
                collect(Collectors.toList());

        dupList.forEach(System.out::println);


       // list.stream().distinct().forEach(System.out::println);
    }
}
