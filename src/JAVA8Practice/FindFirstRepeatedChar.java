package JAVA8Practice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedChar {


    public static void main (String[] z)
    {
        String inout = "kathir kat";

        inout.chars()
                .mapToObj(a -> Character.toLowerCase((char) a))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()>1L)
                .map(y -> y.getKey())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
