package JAVA8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartWithOne {

    public static void main (String[] d)
    {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        List<String> stringList = myList.stream()
                .map(s -> s + "")
                .filter(a -> a.startsWith("1"))
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);

    }
}
