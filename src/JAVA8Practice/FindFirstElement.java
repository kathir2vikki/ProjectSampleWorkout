package JAVA8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String[] b)
    {
        List<Integer> list = Arrays.asList(12, 56, 45, 78, 45);

        int[] arrqay = {21,23,45,67};

        list.stream().findFirst().ifPresent(System.out::println);


        Arrays.stream(arrqay).boxed().findFirst().ifPresent(System.out::println);


    }
}
