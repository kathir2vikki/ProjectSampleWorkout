package JAVA8Practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountOfString {

    public static void main(String[] z)
    {
        List<String> s = List.of("kathir", "kathir"," vikki");

        Map<String, Long> hm = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        hm.forEach((x,y) -> System.out.println(x + "=====" + y));
    }
}
