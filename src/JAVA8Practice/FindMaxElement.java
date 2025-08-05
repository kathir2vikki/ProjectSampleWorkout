package JAVA8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {

    public static void main(String[] a)
    {
        List<Integer> liste= Arrays.asList(2,8,4,8,9,3,6,89,5);

        int count = liste.stream().max(getCompare()).get();

        System.out.println(count);

    }

    private static Comparator<Integer> getCompare() {
        return Integer::compare;
    }
}
