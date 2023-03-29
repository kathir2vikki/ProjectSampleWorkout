package JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparing {


    public static void main (String a[])
    {
        Integer[] input = {3,4,5,6,7,1};

        Integer output = Arrays.stream(input).min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(output);

        Integer outputMax = Arrays.stream(input).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(outputMax);


        List<Integer> integerList = Arrays.asList(4,5,2,4,6,10);

        System.out.println("Max integer" + integerList.stream().max(Comparator.comparing(Integer::valueOf)).get());

    }
}
