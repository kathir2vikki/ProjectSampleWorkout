package JAVA8Practice;

import java.util.Arrays;
import java.util.List;

public class TotalNumOfElements {

    public static void main(String[] a)
    {
        List<Integer> list = Arrays.asList(15,56,45,78,89,9);

        Long  count = list.stream().count();

        System.out.println(count);
    }
}
