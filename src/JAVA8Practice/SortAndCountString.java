package JAVA8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortAndCountString {


    public static void main(String[] a)
    {
        List<String> list = Arrays.asList("bannana", "apple", "bannana", "apple");

        Map<String, Long> hm = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));


        hm.forEach((x,y) -> System.out.println(x + "=====" + y));

    }
}
