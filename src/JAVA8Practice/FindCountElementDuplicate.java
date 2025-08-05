package JAVA8Practice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountElementDuplicate {

    public static void main(String[] z)
    {
        List<Integer> ls = List.of(1 , 3,3,4);

        Map<Integer, Long> hm = ls.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()>=1L)
                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));


        hm.forEach((x,y) -> System.out.println(x + "=====" + y));
    }
}
