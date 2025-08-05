package JAVA8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {


    public static void main(String[] z)
    {
        List<Integer> listOne = Arrays.asList(1,2,3);
        List<Integer> likstTwo = Arrays.asList(5,6,7);

        Stream<Integer> concatStream = Stream.concat(listOne.stream(),likstTwo.stream());


        concatStream.forEach(System.out::println);
    }
}
