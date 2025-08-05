package JAVA8Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonDistinctItem {


    public static void main(String[] a) {
        String s1 = "123456";
        String s2 = "122333445";

        List<Character> l2 = s2.chars().mapToObj(z -> Character.toLowerCase((char) z)).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1l)
                .map(g -> g.getKey())
                .collect(Collectors.toList());

        List<Character> l1 = s1.chars().mapToObj(m -> Character.toLowerCase((char) m)).collect(Collectors.toList());

        List<Character> listOfAdditionalItems = l1.stream()
                .filter(item -> l2.contains(item))
                .collect(Collectors.toList());


        listOfAdditionalItems.stream().forEach(System.out::println);


    }
}
