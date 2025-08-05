package JAVA8Practice;

import java.util.Arrays;

public class ArraySortIntoStream {

    public static void main(String[]  v)
    {
        int[] a = {5,2,6,8,4};

        Arrays.sort(a);

        Arrays.stream(a).forEach(System.out::println);
    }
}
