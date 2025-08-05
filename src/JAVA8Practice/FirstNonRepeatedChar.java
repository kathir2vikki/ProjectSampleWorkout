package JAVA8Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    public static void main(String[] z)
    {
        List<String> s = List.of("kathir kat");

        String input = "Kathir kat";

        //Character c =
                input
                .chars()
                .mapToObj(d -> Character.toLowerCase((char) d))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p -> p.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);
                //.get();

        //System.out.println(c);


        input.chars()
                .mapToObj(d -> Character.toLowerCase((char)d))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(v -> v.getValue() == 1L)
                .map(c -> c.getKey())
                .findFirst()
                .ifPresent(System.out::println);

    }
}
